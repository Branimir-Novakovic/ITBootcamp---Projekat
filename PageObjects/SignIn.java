package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	public static final String URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	public static final String URL_AFTERSIGNIN = "https://petstore.octoperf.com/actions/Catalog.action";

	private static final String USERNAME = "//input[@name='username']";
	private static final String PASSWORD = "//input[@name='password']";
	private static final String SIGNIN = "//input[@name='signon']";
	private static final String SIGNOUT= "//a[contains(text(),'Sign Out')]";

	private static final String REGISTERNOW = "//a[contains(text(),'Register Now!')]";

	// sign in methods
	public static WebElement getUsername(WebDriver driver) {
		return driver.findElement(By.xpath(USERNAME));
	}

	public static void clickUsername(WebDriver driver) {
		getUsername(driver).click();
	}

	public static void inputUsername(WebDriver driver, String data) {
		getUsername(driver).sendKeys(data);
	}

	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void inputPassword(WebDriver driver, String data) {
		getPassword(driver).sendKeys(data);
	}

	public static WebElement getSignInBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNIN));
	}

	public static void clickSignInBtn(WebDriver driver) {
		getSignInBtn(driver).click();
	}

	// go to registration page methods
	public static WebElement getRegisterNowBtn(WebDriver driver) {
		return driver.findElement(By.xpath(REGISTERNOW));
	}

	public static void clickRegisterNow(WebDriver driver) {
		getRegisterNowBtn(driver).click();
	}

	// sign out methods
	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNOUT));
	}

	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();
	}
}
