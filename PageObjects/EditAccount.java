package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditAccount {
	public static final String URL = "https://petstore.octoperf.com/actions/Account.action?editAccountForm=";
	public static final String URL_AFTEREDIT = "https://petstore.octoperf.com/actions/Account.action";

	private static final String USER_ID = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String NEW_PASSWORD = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
	private static final String REPEAT_PASSWORD = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]";
	
	private static final String FIRST_NAME = "//input[@name='account.firstName']";
	private static final String LAST_NAME = "//input[@name='account.lastName']";
	private static final String EMAIL = "//input[@name='account.email']";
	private static final String PHONE = "//input[@name='account.phone']";
	private static final String ADDRESS1 = "//input[@name='account.address1']";
	private static final String ADDRESS2 = "//input[@name='account.address2']";
	private static final String CITY = "//input[@name='account.city']";
	private static final String STATE = "//input[@name='account.state']";
	private static final String ZIP = "//input[@name='account.zip']";
	private static final String COUNTRY = "//input[@name='account.country']";
	private static final String LANGUAGE = "//select[@name='account.languagePreference']";
	private static final String FAVORITE_CATEGORY = "//select[@name='account.favouriteCategoryId']";
	private static final String ENABLEMYLIST = "//input[@name='account.listOption']";
	private static final String ENABLEMYBANNER = "//input[@name='account.bannerOption']";
	private static final String SAVEACCTINFOBTN = "//input[@name='editAccount']";


	// Metode za objekat USER ID
			public static WebElement getUserID(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(USER_ID));
				return wb;
			}
			
			public static void clickUserID(WebDriver dr) {
				getUserID(dr).click();
			}

			public static void deleteUserID(WebDriver driver) {
				getUserID(driver).clear();
			}
			
			public static void enterUserID(WebDriver dr, String text) {
				getUserID(dr).sendKeys(text);
			}
			
			// Metode za objekat NEW PASSWORD
			public static WebElement getNewPassword(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(NEW_PASSWORD));
				return wb;
			}

			public static void clickNewPassword(WebDriver dr) {
				getNewPassword(dr).click();
			}
			
			public static void deleteNewPassword(WebDriver driver) {
				getNewPassword(driver).clear();
			}

			public static void enterNewPassword(WebDriver dr, String text) {
				getNewPassword(dr).sendKeys(text);
			}
			
			// Metode za objekat REPEAT PASSWORD
			
			public static WebElement getRepeatPassword(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(REPEAT_PASSWORD));
				return wb;
			}

			public static void clickRepeatPassword(WebDriver dr) {
				getRepeatPassword(dr).click();
			}
			
			public static void deleteRepeatPassword(WebDriver driver) {
				getRepeatPassword(driver).clear();
			}

			public static void enterRepeatPassword(WebDriver dr, String text) {
				getRepeatPassword(dr).sendKeys(text);
			}
			
			// Metode za objekat FIRST NAME
			public static WebElement getFirstName(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(FIRST_NAME));
				return wb;
			}

			public static void clickFirstName(WebDriver dr) {
				getFirstName(dr).click();
			}

			public static void deleteFirstName(WebDriver driver) {
				getFirstName(driver).clear();
			}

			public static void enterFirstName(WebDriver dr, String text) {
				getFirstName(dr).sendKeys(text);
			}
			
			// Metode za objekat LAST NAME
			public static WebElement getLastName(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(LAST_NAME));
				return wb;
			}

			public static void clickLastName(WebDriver dr) {
				getLastName(dr).click();
			}

			public static void deleteLastName(WebDriver driver) {
				getLastName(driver).clear();
			}

			public static void enterLastName(WebDriver dr, String text) {
				getLastName(dr).sendKeys(text);
			}
			
			// Metode za objekat EMAIL
			public static WebElement getEmail(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(EMAIL));
				return wb;
			}

			public static void clickEmail(WebDriver dr) {
				getEmail(dr).click();
			}

			public static void deleteEmail(WebDriver driver) {
				getEmail(driver).clear();
			}

			public static void enterEmail(WebDriver dr, String text) {
				getEmail(dr).sendKeys(text);
			}
			
			// Metode za objekat PHONE
			public static WebElement getPhone(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(PHONE));
				return wb;
			}

			public static void clickPhone(WebDriver dr) {
				getPhone(dr).click();
			}
			
			public static void deletePhone(WebDriver driver) {
				getPhone(driver).clear();
			}

			public static void enterPhone(WebDriver dr, String text) {
				getPhone(dr).sendKeys(text);
			}
			
			// Metode za objekat ADDRESS1
			public static WebElement getAddress1(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(ADDRESS1));
				return wb;
			}

			public static void clickAddress1(WebDriver dr) {
				getAddress1(dr).click();
			}

			public static void deleteAddress1(WebDriver driver) {
				getAddress1(driver).clear();
			}
			
			public static void enterAddress1(WebDriver dr, String text) {
				getAddress1(dr).sendKeys(text);
			}	
			
			// Metode za objekat ADDRESS2
			public static WebElement getAddress2(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(ADDRESS2));
				return wb;
			}

			public static void clickAddress2(WebDriver dr) {
				getAddress2(dr).click();
			}
			
			public static void deleteAddress2(WebDriver driver) {
				getAddress2(driver).clear();
			}

			public static void enterAddress2(WebDriver dr, String text) {
				getAddress2(dr).sendKeys(text);
			}	
			
			// Metode za objekat CITY
			public static WebElement getCity(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(CITY));
				return wb;
			}

			public static void clickCity(WebDriver dr) {
				getCity(dr).click();
			}

			public static void deleteCity(WebDriver driver) {
				getCity(driver).clear();
			}
			
			public static void enterCity(WebDriver dr, String text) {
				getCity(dr).sendKeys(text);
			}	
			
			// Metode za objekat STATE
			public static WebElement getState(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(STATE));
				return wb;
			}

			public static void clickState(WebDriver dr) {
				getState(dr).click();
			}

			public static void deleteState(WebDriver driver) {
				getState(driver).clear();
			}
			
			public static void enterState(WebDriver dr, String text) {
				getState(dr).sendKeys(text);
			}	
			
			// Metode za objekat ZIP
			public static WebElement getZip(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(ZIP));
				return wb;
			}

			public static void clickZip(WebDriver dr) {
				getZip(dr).click();
			}

			public static void deleteZip(WebDriver driver) {
				getZip(driver).clear();
			}

			public static void enterZip(WebDriver dr, String text) {
				getZip(dr).sendKeys(text);
			}	
			
			// Metode za objekat COUNTRY
			public static WebElement getCountry(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(COUNTRY));
				return wb;
			}

			public static void clickCountry(WebDriver dr) {
				getCountry(dr).click();
			}

			public static void deleteCountry(WebDriver driver) {
				getCountry(driver).clear();
			}

			public static void enterCountry(WebDriver dr, String text) {
				getCountry(dr).sendKeys(text);
			}	
			
			// Metode za objekat LANGUAGE
			public static Select getLanguage(WebDriver driver) {
				
				return new Select(driver.findElement(By.xpath(LANGUAGE)));
			}
			
			public static void enterLanguage(WebDriver dr, String data) {
				getLanguage(dr).selectByVisibleText(data);
			}
			
			public static Select getFavoriteCategory(WebDriver driver) {
				return new Select(driver.findElement(By.xpath(FAVORITE_CATEGORY)));
			}

			public static void inputFavoriteCategory(WebDriver driver, String data) {
				getFavoriteCategory(driver).selectByVisibleText(data);
			}
			
			public static WebElement getEnableMyList(WebDriver driver) {
				return driver.findElement(By.xpath(ENABLEMYLIST));
			}

			public static void clickEnableMyList(WebDriver driver) {
				getEnableMyList(driver).click();
			}
			
			public static WebElement getEnableMyBanner(WebDriver driver) {
				return driver.findElement(By.xpath(ENABLEMYBANNER));
			}

			public static void clickEnableMyBanner(WebDriver driver) {
				getEnableMyBanner(driver).click();
			}

			public static WebElement getSaveAcctInfo(WebDriver driver) {
				return driver.findElement(By.xpath(SAVEACCTINFOBTN));
			}

			public static void clickSaveAcctInfo(WebDriver driver) {
				getSaveAcctInfo(driver).click();
			}
		}
			
			
			
	