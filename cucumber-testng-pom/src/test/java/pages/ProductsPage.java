package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	WebDriver driver;
	
	private By product1 = By.id("item_4_title_link");
	private By button = By.xpath("//div[@class='inventory_item'][1]//button");
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		
	}
	public void selectProduct1() {
		driver.findElement(product1);
		}
	public void clickBtn() {
		driver.findElement(button).click();
	}
	public String getBtnText() {
		return driver.findElement(button).getText();
	}
}
