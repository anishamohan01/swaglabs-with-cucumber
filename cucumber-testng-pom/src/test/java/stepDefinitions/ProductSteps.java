package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductsPage;

public class ProductSteps {
	ProductsPage pp;
	
	@Given("I navigate to products page")
	public void goToProductsPage() {
		pp = new ProductsPage(LoginSteps.driver);
	}
	
	@When("I click on Add to cart button")
	public void clickAddToCartBtn() {
		pp.clickBtn();
	}
	
	@Then("Button should be changed to Remove and cart should show 1 item added")
	public void itemAdd() {
		Assert.assertEquals(pp.getBtnText(),"Remove");
	}
	

}
