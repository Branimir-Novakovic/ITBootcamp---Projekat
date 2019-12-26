package page.objects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AnimalCategories {
	// fish url
	public static final String URL_FISH = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";

	// dogs url
	public static final String URL_DOGS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";

	// reptiles url
	public static final String URL_REPRILES = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";

	// cats url
	public static final String URL_CATS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";

	// birds url
	public static final String URL_BIRDS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";

	// add to cart button
	private static final String ADDTOCART = "//a[@class='Button']";

	
	// birds xpath - amazon parrot
		private static final String AMAZON_PARROT_XPATH = "//a[contains(text(),'AV-CB-01')]";
		private static final String AMAZON_PARROT_ADULT_MALE_XPATH = "//a[contains(text(),'EST-18')]";

		// birds xpath - finch
		private static final String FINCH_XPATH = "//a[contains(text(),'AV-SB-02')]";
		private static final String FINCH_ADULT_MALE_XPATH = "//a[contains(text(),'EST-19')]";


	
	// birds methods
	public static WebElement getFinch(WebDriver driver) {
		return driver.findElement(By.xpath(FINCH_XPATH));
	}

	public static void clickFinch(WebDriver driver) {
		getFinch(driver).click();
	}

	public static WebElement getFinchAdultMale(WebDriver driver) {
		return driver.findElement(By.xpath(FINCH_ADULT_MALE_XPATH));
	}

	public static void clickFinchAdultMale(WebDriver driver) {
		getFinchAdultMale(driver).click();
	}

	// add to cart methods
	public static WebElement getAddToCart(WebDriver driver) {
		return driver.findElement(By.xpath(ADDTOCART));
	}

	public static void clickAddToCart(WebDriver driver) {
		getAddToCart(driver).click();
	}
}
