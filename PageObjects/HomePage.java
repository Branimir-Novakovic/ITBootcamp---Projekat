package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static final String URL = "https://petstore.octoperf.com/";
	private static final String ENTERSTORE = "//a[contains(text(),'Enter the Store')]";

	public static WebElement getEnterStore(WebDriver driver) {
		return driver.findElement(By.xpath(ENTERSTORE));
	}

	public static void clickEnterStore(WebDriver driver) {
		getEnterStore(driver).click();
	}
}