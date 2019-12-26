package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.EditAccount;
import page.objects.PetStoreMenu;
import page.objects.SignIn;
import utility.ExcelUtils;

public class SignInTest {
	WebDriver driver = new ChromeDriver();
	String url = SignIn.URL;
	
	WebElement tempWE = null;
	String tempS = "";

	@BeforeTest
	public void beforeTests() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		String currUrl = driver.getCurrentUrl();
		if (url.equals(currUrl)) {
			System.out.println("Otvorena je trazena stranica!");
		} else {
			System.out.println("Nije otvorena trazena stranica!");
			System.out.println("Trenutni url je " + currUrl);
		}
	}

	@AfterTest
	public void afterTests() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test(priority = 1)
	public void signInTestOneUserExcel() {

		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);
		String username = ExcelUtils.getDataAt(1, 0);
		String password = ExcelUtils.getDataAt(1, 1);
		SoftAssert sa = new SoftAssert();
		SignIn.inputUsername(driver, username);
		tempWE = SignIn.getUsername(driver);
		sa.assertEquals(tempWE.getAttribute("value"), username);

		SignIn.inputPassword(driver, password);
		tempWE = SignIn.getPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), password);

		SignIn.clickSignInBtn(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, SignIn.URL_AFTERSIGNIN);

		sa.assertAll();
	}

	@Test(priority = 2)
	public void signInTestAllUserExcel() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
			driver.get(url);

			String username = ExcelUtils.getDataAt(i, 0);
			String password = ExcelUtils.getDataAt(i, 1);

			EditAccount.deleteNewPassword(driver);
			Thread.sleep(500);
			
			SignIn.inputUsername(driver, username);
			tempWE = SignIn.getUsername(driver);
			sa.assertEquals(tempWE.getAttribute("value"), username);

			SignIn.inputPassword(driver, password);
			tempWE = SignIn.getPassword(driver);
			sa.assertEquals(tempWE.getAttribute("value"), password);

			SignIn.clickSignInBtn(driver);
			String currUrl = driver.getCurrentUrl();
			currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
			sa.assertEquals(currUrl, SignIn.URL_AFTERSIGNIN);

			SignIn.clickSignOut(driver);
			currUrl = driver.getCurrentUrl();
			currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
			sa.assertEquals(currUrl, PetStoreMenu.URL);

			sa.assertAll();
		}
	}
}
