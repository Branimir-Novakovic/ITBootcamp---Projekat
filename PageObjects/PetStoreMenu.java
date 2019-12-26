package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMenu {

	public static final String URL = "https://petstore.octoperf.com/actions/Catalog.action";

	// Top menu
	private static final String FISH_TOP = "//div[@id='QuickLinks']//a[1]//img[1]";
	private static final String DOGS_TOP = "//div[@id='Header']//a[2]//img[1]";
	private static final String CATS_TOP = "//div[@id='Header']//a[4]//img[1]";
	private static final String REPTILES_TOP = "//div[@id='Header']//a[3]//img[1]";
	private static final String BIRDS_TOP = "//div[@id='Header']//a[5]//img[1]";

	// Side menu
	private static final String FISH_SIDE = "//div[@id='Content']//a[1]//img[1]";
	private static final String DOGS_SIDE = "//div[@id='Content']//a[2]//img[1]";
	private static final String CATS_SIDE = "//div[@id='Content']//a[3]//img[1]";
	private static final String REPTILES_SIDE = "//div[@id='Content']//a[4]//img[1]";
	private static final String BIRDS_SIDE = "//div[@id='Content']//a[5]//img[1]";

	// Photo menu
	private static final String FISH_PHOTOMENU = "//body//area[2]";
	private static final String DOGS_PHOTOMENU = "//body//area[3]";
	private static final String CATS_PHOTOMENU = "//body//area[5]";
	private static final String REPTILES_PHOTOMENU = "//body//area[4]";
	private static final String BIRDS_PHOTOMENU = "//body//area[6]";
	private static final String BIRDS_PHOTOMENUL = "//body//area[1]";

	// Sign in
	private static final String SIGNIN = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]";
	private static final String MYACCTBTN_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[3]";

	// Metode za top menu
	public static WebElement getFishTop(WebDriver driver) {
		return driver.findElement(By.xpath(FISH_TOP));
	}

	public static void clickFishTop(WebDriver driver) {
		getFishTop(driver).click();
	}

	public static WebElement getDogsTop(WebDriver driver) {
		return driver.findElement(By.xpath(DOGS_TOP));
	}

	public static void clickDogsTop(WebDriver driver) {
		getDogsTop(driver).click();
	}

	public static WebElement getCatsTop(WebDriver driver) {
		return driver.findElement(By.xpath(CATS_TOP));
	}

	public static void clickCatsTop(WebDriver driver) {
		getCatsTop(driver).click();
	}

	public static WebElement getReptilesTop(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILES_TOP));
	}

	public static void clickReptilesTop(WebDriver driver) {
		getReptilesTop(driver).click();
	}

	public static WebElement getBirdsTop(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS_TOP));
	}

	public static void clickBirdsTopMenu(WebDriver driver) {
		getBirdsTop(driver).click();
	}

	// Metode za side menu
	public static WebElement getFishSide(WebDriver driver) {
		return driver.findElement(By.xpath(FISH_SIDE));
	}

	public static void clickFishSide(WebDriver driver) {
		getFishSide(driver).click();
	}

	public static WebElement getDogsSide(WebDriver driver) {
		return driver.findElement(By.xpath(DOGS_SIDE));
	}

	public static void clickDogsSide(WebDriver driver) {
		getDogsSide(driver).click();
	}

	public static WebElement getCatsSide(WebDriver driver) {
		return driver.findElement(By.xpath(CATS_SIDE));
	}

	public static void clickCatsSide(WebDriver driver) {
		getCatsSide(driver).click();
	}

	public static WebElement getReptilesSide(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILES_SIDE));
	}

	public static void clickReptilesSide(WebDriver driver) {
		getReptilesSide(driver).click();
	}

	public static WebElement getBirdsSide(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS_SIDE));
	}

	public static void clickBirdsSide(WebDriver driver) {
		getBirdsSide(driver).click();
	}

	// Metode za image menu
	public static WebElement getFishPhotoMenu(WebDriver driver) {
		return driver.findElement(By.xpath(FISH_PHOTOMENU));
	}

	public static void clickFishPhotoMenu(WebDriver driver) {
		getFishPhotoMenu(driver).click();
	}

	public static WebElement getDogsPhotoMenu(WebDriver driver) {
		return driver.findElement(By.xpath(DOGS_PHOTOMENU));
	}

	public static void clickDogsPhotoMenu(WebDriver driver) {
		getDogsPhotoMenu(driver).click();
	}

	public static WebElement getCatsPhotoMenu(WebDriver driver) {
		return driver.findElement(By.xpath(CATS_PHOTOMENU));
	}

	public static void clickCatsPhotoMenu(WebDriver driver) {
		getCatsPhotoMenu(driver).click();
	}

	public static WebElement getReptilesPhotoMenu(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILES_PHOTOMENU));
	}

	public static void clickReptilesPhotoMenu(WebDriver driver) {
		getReptilesPhotoMenu(driver).click();
	}

	public static WebElement getBirdsPhotoMenu(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS_PHOTOMENU));
	}

	public static void clickBirdsPhotoMenu(WebDriver driver) {
		getBirdsPhotoMenu(driver).click();
	}

	public static WebElement getBirdsPhotoMenuL(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS_PHOTOMENUL));
	}

	public static void clickBirdsPhotoMenuL(WebDriver driver) {
		getBirdsPhotoMenuL(driver).click();
	}

	// Metode za click sign button
	public static WebElement getSignIn(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNIN));
	}

	public static void clickSignIn(WebDriver driver) {
		getSignIn(driver).click();
	}
	
	//metoda za my account button
	
	public static WebElement getMyAcctBtn(WebDriver driver) {
		return driver.findElement(By.xpath(MYACCTBTN_XPATH));
	}

	public static void clickMyAcctBtn(WebDriver driver) {
		getMyAcctBtn(driver).click();
	}

}