package page.tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreMenu;

public class HomePageTest {
	WebDriver driver = new ChromeDriver();
	SoftAssert sa = new SoftAssert();
	String url = HomePage.URL;

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

	@Test
	public void enterTheStoreTest() {
		HomePage.clickEnterStore(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, PetStoreMenu.URL);
		sa.assertAll();
	}
}
