package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.PetStoreMenu;

public class PetStoreMenuTest {
	WebDriver driver = new ChromeDriver();
	String url = PetStoreMenu.URL;
	SoftAssert sa = new SoftAssert();

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
	public void topMenuTest() {
		PetStoreMenu.clickBirdsTopMenu(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS");

		driver.get(url);
		PetStoreMenu.clickCatsTop(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS");

		driver.get(url);
		PetStoreMenu.clickDogsTop(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS");

		driver.get(url);
		PetStoreMenu.clickFishTop(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH");

		driver.get(url);
		PetStoreMenu.clickReptilesTop(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES");

		sa.assertAll();
	}

	@Test(priority = 2)
	public void sideMenuTest() {
		driver.get(url);
		PetStoreMenu.clickBirdsSide(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS");

		driver.get(url);
		PetStoreMenu.clickCatsSide(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS");

		driver.get(url);
		PetStoreMenu.clickDogsSide(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS");

		driver.get(url);
		PetStoreMenu.clickFishSide(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH");

		driver.get(url);
		PetStoreMenu.clickReptilesSide(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES");

		sa.assertAll();
	}

	@Test(priority = 3)
	public void imageMenuTest() {
		driver.get(url);
		PetStoreMenu.clickBirdsPhotoMenu(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS");

		driver.get(url);
		PetStoreMenu.clickBirdsPhotoMenuL(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS");

		driver.get(url);
		PetStoreMenu.clickCatsPhotoMenu(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS");

		driver.get(url);
		PetStoreMenu.clickDogsPhotoMenu(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS");

		driver.get(url);
		PetStoreMenu.clickFishPhotoMenu(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH");

		driver.get(url);
		PetStoreMenu.clickReptilesPhotoMenu(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES");

		sa.assertAll();
	}

	@Test(priority = 4)
	public void SignInTest() {
		driver.get(url);
		PetStoreMenu.clickSignIn(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Account.action?signonForm=");

		sa.assertAll();
	}
}
