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

public class EditUserInfoTest {
	WebDriver driver = new ChromeDriver();
	SoftAssert sa = new SoftAssert();
	String url = PetStoreMenu.URL;
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
	public void signInTestOneUserWClearPass() throws InterruptedException {
		driver.get(SignIn.URL);
		SignIn.inputUsername(driver, "user123");
		tempWE = SignIn.getUsername(driver);
		sa.assertEquals(tempWE.getAttribute("value"), "user123");
		Thread.sleep(1000);

		SignIn.getPassword(driver).clear();

		SignIn.inputPassword(driver, "pass123");
		tempWE = SignIn.getPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), "pass123");

		SignIn.clickSignInBtn(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, SignIn.URL_AFTERSIGNIN);
		sa.assertAll();
	}

	@Test(priority = 2)
	public void EditSignedInUserInfoTest() {
		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);

		String password = ExcelUtils.getDataAt(2, 1);
		String confPassword = ExcelUtils.getDataAt(2, 1);

		String firstName = ExcelUtils.getDataAt(2, 2);
		String lastName = ExcelUtils.getDataAt(2, 3);
		String email = ExcelUtils.getDataAt(2, 4);
		String phone = ExcelUtils.getDataAt(2, 5);
		String address1 = ExcelUtils.getDataAt(2, 6);
		String address2 = ExcelUtils.getDataAt(2, 7);
		String city = ExcelUtils.getDataAt(2, 8);
		String state = ExcelUtils.getDataAt(2, 9);
		String zip = ExcelUtils.getDataAt(2, 10);
		String country = ExcelUtils.getDataAt(2, 11);

		String language = "english";
		String favoriteCategory = "DOGS";


		PetStoreMenu.clickMyAcctBtn(driver);
		sa.assertEquals(driver.getCurrentUrl(), EditAccount.URL);

		EditAccount.deleteNewPassword(driver);
		EditAccount.enterNewPassword(driver, password);
		tempWE = EditAccount.getNewPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), password);

		EditAccount.deleteRepeatPassword(driver);
		EditAccount.enterRepeatPassword(driver, confPassword);
		tempWE = EditAccount.getRepeatPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), confPassword);

		EditAccount.deleteFirstName(driver);
		EditAccount.enterFirstName(driver, firstName);
		tempWE = EditAccount.getFirstName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), firstName);

		EditAccount.deleteLastName(driver);
		EditAccount.enterLastName(driver, lastName);
		tempWE = EditAccount.getLastName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), lastName);

		EditAccount.deleteEmail(driver);
		EditAccount.enterEmail(driver, email);
		tempWE = EditAccount.getEmail(driver);
		sa.assertEquals(tempWE.getAttribute("value"), email);

		EditAccount.deletePhone(driver);
		EditAccount.enterPhone(driver, phone);
		tempWE = EditAccount.getPhone(driver);
		sa.assertEquals(tempWE.getAttribute("value"), phone);

		EditAccount.deleteAddress1(driver);
		EditAccount.enterAddress1(driver, address1);
		tempWE = EditAccount.getAddress1(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address1);

		EditAccount.deleteAddress2(driver);
		EditAccount.enterAddress2(driver, address2);
		tempWE = EditAccount.getAddress2(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address2);

		EditAccount.deleteCity(driver);
		EditAccount.enterCity(driver, city);
		tempWE = EditAccount.getCity(driver);
		sa.assertEquals(tempWE.getAttribute("value"), city);

		EditAccount.deleteState(driver);
		EditAccount.enterState(driver, state);
		tempWE = EditAccount.getState(driver);
		sa.assertEquals(tempWE.getAttribute("value"), state);

		EditAccount.deleteZip(driver);
		EditAccount.enterZip(driver, zip);
		tempWE = EditAccount.getZip(driver);
		sa.assertEquals(tempWE.getAttribute("value"), zip);

		EditAccount.deleteCountry(driver);
		EditAccount.enterCountry(driver, country);
		tempWE = EditAccount.getCountry(driver);
		sa.assertEquals(tempWE.getAttribute("value"), country);

		EditAccount.enterLanguage(driver, language);
		tempS = EditAccount.getLanguage(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, language);

		EditAccount.inputFavoriteCategory(driver, favoriteCategory);
		tempS = EditAccount.getFavoriteCategory(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, favoriteCategory);

		EditAccount.clickEnableMyList(driver);
		tempWE = EditAccount.getEnableMyList(driver);
	
		tempWE = EditAccount.getEnableMyBanner(driver);
	
		EditAccount.clickSaveAcctInfo(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, EditAccount.URL_AFTEREDIT);

		sa.assertAll();
	}

	@Test(priority = 3)
	public void userSignOut() {
		SignIn.clickSignOut(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, PetStoreMenu.URL);
	}

	@Test(priority = 4)
	public void userSignInAndCheckInfo() {
		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);

		String password = ExcelUtils.getDataAt(2, 1);
		String confPassword = ExcelUtils.getDataAt(2, 1);

		String firstName = ExcelUtils.getDataAt(2, 2);
		String lastName = ExcelUtils.getDataAt(2, 3);
		String email = ExcelUtils.getDataAt(2, 4);
		String phone = ExcelUtils.getDataAt(2, 5);
		String address1 = ExcelUtils.getDataAt(2, 6);
		String address2 = ExcelUtils.getDataAt(2, 7);
		String city = ExcelUtils.getDataAt(2, 8);
		String state = ExcelUtils.getDataAt(2, 9);
		String zip = ExcelUtils.getDataAt(2, 10);
		String country = ExcelUtils.getDataAt(2, 11);

	    String language1 = "english";
	
		String favoriteCategory = "DOGS";


		PetStoreMenu.clickSignIn(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, SignIn.URL);

		SignIn.inputUsername(driver, "user123");
		tempWE = SignIn.getUsername(driver);
		sa.assertEquals(tempWE.getAttribute("value"), "user123");

		SignIn.getPassword(driver).clear();

		SignIn.inputPassword(driver, "pass123");
		tempWE = SignIn.getPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), "pass123");

		SignIn.clickSignInBtn(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMenu.clickMyAcctBtn(driver);
		sa.assertEquals(driver.getCurrentUrl(), EditAccount.URL);

		tempWE = EditAccount.getNewPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), password);

		tempWE = EditAccount.getRepeatPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), confPassword);

		tempWE = EditAccount.getFirstName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), firstName);

		tempWE = EditAccount.getLastName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), lastName);

		tempWE = EditAccount.getEmail(driver);
		sa.assertEquals(tempWE.getAttribute("value"), email);

		tempWE = EditAccount.getPhone(driver);
		sa.assertEquals(tempWE.getAttribute("value"), phone);

		tempWE = EditAccount.getAddress1(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address1);

		tempWE = EditAccount.getAddress2(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address2);

		tempWE = EditAccount.getCity(driver);
		sa.assertEquals(tempWE.getAttribute("value"), city);

		tempWE = EditAccount.getState(driver);
		sa.assertEquals(tempWE.getAttribute("value"), state);

		tempWE = EditAccount.getZip(driver);
		sa.assertEquals(tempWE.getAttribute("value"), zip);

		tempWE = EditAccount.getCountry(driver);
		sa.assertEquals(tempWE.getAttribute("value"), country);

		tempS = EditAccount.getLanguage(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, language1);

		tempS = EditAccount.getFavoriteCategory(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, favoriteCategory);

		tempWE = EditAccount.getEnableMyList(driver);
		// sa.assertEquals(tempWE.getAttribute("value").isEmpty(), false);

		tempWE = EditAccount.getEnableMyBanner(driver);
		// sa.assertEquals(tempWE.getAttribute("value").isEmpty(), true);

		sa.assertAll();
	}
}
