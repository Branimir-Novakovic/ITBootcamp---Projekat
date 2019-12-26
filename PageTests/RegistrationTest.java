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
import page.objects.Registration;

import utility.ExcelUtils;

public class RegistrationTest {
	WebDriver driver = new ChromeDriver();
	String url = Registration.URL;
	SoftAssert sa = new SoftAssert();
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
	public void RegistrationFormTestOneUserExcel() {
		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);
		
		//String username = String.valueOf(Math.random());
		String username = ExcelUtils.getDataAt(1, 0);
		String password = ExcelUtils.getDataAt(1, 1);
		String confPassword = ExcelUtils.getDataAt(1, 1);

		String firstName = ExcelUtils.getDataAt(1, 2);
		String lastName = ExcelUtils.getDataAt(1, 3);
		String email = ExcelUtils.getDataAt(1, 4);
		String phone = ExcelUtils.getDataAt(1, 5);
		String address1 = ExcelUtils.getDataAt(1, 6);
		String address2 = ExcelUtils.getDataAt(1, 7);
		String city = ExcelUtils.getDataAt(1, 8);
		String state = ExcelUtils.getDataAt(1, 9);
		String zip = ExcelUtils.getDataAt(1, 10);
		String country = ExcelUtils.getDataAt(1, 11);

		String language = "english";
	
		String favoriteCategory = "DOGS";


		Registration.enterUserID(driver, username);
		tempWE = Registration.getUserID(driver);
		sa.assertEquals(tempWE.getAttribute("value"), username);

		Registration.enterNewPassword(driver, password);
		tempWE = Registration.getNewPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), password);

		Registration.enterRepeatPassword(driver, confPassword);
		tempWE = Registration.getRepeatPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), confPassword);

		Registration.enterFirstName(driver, firstName);
		tempWE = Registration.getFirstName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), firstName);

		Registration.enterLastName(driver, lastName);
		tempWE = Registration.getLastName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), lastName);

		Registration.enterEmail(driver, email);
		tempWE = Registration.getEmail(driver);
		sa.assertEquals(tempWE.getAttribute("value"), email);

		Registration.enterPhone(driver, phone);
		tempWE = Registration.getPhone(driver);
		sa.assertEquals(tempWE.getAttribute("value"), phone);

		Registration.enterAddress1(driver, address1);
		tempWE = Registration.getAddress1(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address1);

		Registration.enterAddress2(driver, address2);
		tempWE = Registration.getAddress2(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address2);

		Registration.enterCity(driver, city);
		tempWE = Registration.getCity(driver);
		sa.assertEquals(tempWE.getAttribute("value"), city);

		Registration.enterState(driver, state);
		tempWE = Registration.getState(driver);
		sa.assertEquals(tempWE.getAttribute("value"), state);

		Registration.enterZip(driver, zip);
		tempWE = Registration.getZip(driver);
		sa.assertEquals(tempWE.getAttribute("value"), zip);

		Registration.enterCountry(driver, country);
		tempWE = Registration.getCountry(driver);
		sa.assertEquals(tempWE.getAttribute("value"), country);

		Registration.enterLanguage(driver, language);
		tempS = Registration.getLanguage(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, language);

		Registration.inputFavoriteCategory(driver, favoriteCategory);
		tempS = Registration.getFavoriteCategory(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, favoriteCategory);

		Registration.clickEnableMyList(driver);
		tempWE = Registration.getEnableMyList(driver);
		sa.assertEquals(tempWE.isSelected(), true);

		tempWE = Registration.getEnableMyBanner(driver);
		sa.assertEquals(tempWE.isSelected(), false);

		Registration.clickSaveAcctInfo(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, PetStoreMenu.URL);

		sa.assertAll();
	}

	@Test(priority = 2)
	public void RegistrationFormTestAllUsersExcel() {
		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);

		for (int i = 2; i < ExcelUtils.getRowNumber(); i++) {
	
			driver.get(url);
			
			EditAccount.deleteUserID(driver);
			EditAccount.deleteNewPassword(driver);
			EditAccount.deleteRepeatPassword(driver);
			EditAccount.deleteFirstName(driver);
			EditAccount.deleteLastName(driver);
			EditAccount.deleteEmail(driver);
			EditAccount.deletePhone(driver);
			EditAccount.deleteAddress1(driver);
			EditAccount.deleteAddress2(driver);
			EditAccount.deleteCity(driver);
			EditAccount.deleteState(driver);
			EditAccount.deleteZip(driver);
			EditAccount.deleteCountry(driver);
			if (Registration.getEnableMyList(driver).isSelected() == true) {
				Registration.clickEnableMyList(driver);
			}
			if (Registration.getEnableMyBanner(driver).isSelected() == true) {
				Registration.clickEnableMyBanner(driver);
			}

			String username = ExcelUtils.getDataAt(i, 0);
			String password = ExcelUtils.getDataAt(i, 1);
			String confPassword = ExcelUtils.getDataAt(i, 1);

			String firstName = ExcelUtils.getDataAt(i, 2);
			String lastName = ExcelUtils.getDataAt(i, 3);
			String email = ExcelUtils.getDataAt(i, 4);
			String phone = ExcelUtils.getDataAt(i, 5);
			String address1 = ExcelUtils.getDataAt(i, 6);
			String address2 = ExcelUtils.getDataAt(i, 7);
			String city = ExcelUtils.getDataAt(i, 8);
			String state = ExcelUtils.getDataAt(i, 9);
			String zip = ExcelUtils.getDataAt(i, 10);
			String country = ExcelUtils.getDataAt(i, 11);

			String language = "english";
		
			String favoriteCategory = "DOGS";
	

			Registration.enterUserID(driver, username);
			tempWE = Registration.getUserID(driver);
			sa.assertEquals(tempWE.getAttribute("value"), username);

			Registration.enterNewPassword(driver, password);
			tempWE = Registration.getNewPassword(driver);
			sa.assertEquals(tempWE.getAttribute("value"), password);

			Registration.enterRepeatPassword(driver, confPassword);
			tempWE = Registration.getRepeatPassword(driver);
			sa.assertEquals(tempWE.getAttribute("value"), confPassword);

			Registration.enterFirstName(driver, firstName);
			tempWE = Registration.getFirstName(driver);
			sa.assertEquals(tempWE.getAttribute("value"), firstName);

			Registration.enterLastName(driver, lastName);
			tempWE = Registration.getLastName(driver);
			sa.assertEquals(tempWE.getAttribute("value"), lastName);

			Registration.enterEmail(driver, email);
			tempWE = Registration.getEmail(driver);
			sa.assertEquals(tempWE.getAttribute("value"), email);

			Registration.enterPhone(driver, phone);
			tempWE = Registration.getPhone(driver);
			sa.assertEquals(tempWE.getAttribute("value"), phone);

			Registration.enterAddress1(driver, address1);
			tempWE = Registration.getAddress1(driver);
			sa.assertEquals(tempWE.getAttribute("value"), address1);

			Registration.enterAddress2(driver, address2);
			tempWE = Registration.getAddress2(driver);
			sa.assertEquals(tempWE.getAttribute("value"), address2);

			Registration.enterCity(driver, city);
			tempWE = Registration.getCity(driver);
			sa.assertEquals(tempWE.getAttribute("value"), city);

			Registration.enterState(driver, state);
			tempWE = Registration.getState(driver);
			sa.assertEquals(tempWE.getAttribute("value"), state);

			Registration.enterZip(driver, zip);
			tempWE = Registration.getZip(driver);
			sa.assertEquals(tempWE.getAttribute("value"), zip);

			Registration.enterCountry(driver, country);
			tempWE = Registration.getCountry(driver);
			sa.assertEquals(tempWE.getAttribute("value"), country);

			Registration.enterLanguage(driver, language);
			tempS = Registration.getLanguage(driver).getFirstSelectedOption().getText();
			sa.assertEquals(tempS, language);

			Registration.inputFavoriteCategory(driver, favoriteCategory);
			tempS = Registration.getFavoriteCategory(driver).getFirstSelectedOption().getText();
			sa.assertEquals(tempS, favoriteCategory);

			Registration.clickEnableMyList(driver);
			tempWE = Registration.getEnableMyList(driver);
			sa.assertEquals(tempWE.isSelected(), true);

			tempWE = Registration.getEnableMyBanner(driver);
			sa.assertEquals(tempWE.isSelected(), false);

			Registration.clickSaveAcctInfo(driver);
			String currUrl = driver.getCurrentUrl();
			currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
			sa.assertEquals(currUrl, PetStoreMenu.URL);

			sa.assertAll();
		}
	}
}