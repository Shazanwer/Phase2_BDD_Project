package stepDefs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class PriceValidation {

	WebDriver driver = BaseClass.driver;

	@Then("I am inside the Sauce Demo application on the {string} page")
	public void validatePageName(String ExpPageName) {
		// Write code here that turns the phrase above into concrete actions
		String ActualPageName = driver.findElement(By.xpath("//span[@class='title']")).getText();
		Assert.assertEquals(ExpPageName, ActualPageName);
	}

	@Then("Validate the Prices of the Product")
	public void verifyProductPrices(io.cucumber.datatable.DataTable ProductPrice) {
		// Write code here that turns the phrase above into concrete actions
		int rows = ProductPrice.height();
		for (int i = 0; i < rows; i++) {
			List<WebElement> ProductList = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
			List<WebElement> PriceList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
			if ((ProductList.get(i).getText().equals(String.valueOf(ProductPrice.cell(i, 0))))) {
				System.out.println("Product: " + ProductList.get(i).getText() + ", Price: " + PriceList.get(i).getText());
				Assert.assertEquals(PriceList.get(i).getText(), String.valueOf(ProductPrice.cell(i, 1)));
			}

		}
	}

}
