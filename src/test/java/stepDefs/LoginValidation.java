package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginValidation {
	
	WebDriver driver = BaseClass.driver;
	
	@Given("I have launched the Sauce Demo application in the browser")
	public void i_have_launched_the_Sauce_Demo_application_in_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com");
	}

	@When("I enter the username {string} and the password {string}")
	public void i_enter_the_username_and_the_password(String UserNameVal, String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user-name"));
		UserName.sendKeys(UserNameVal);
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys(PasswordVal);
	}

	@When("I click on the Login Button")
	public void i_click_on_the_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("login-button"));
		LoginBtn.click();
	}

	@Then("I should land on the SWAG LABS page")
	public void i_should_land_on_the_SWAG_LABS_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Inside sauce demo app on SWAG LABS page");
	}

	@Then("I should get error message {string}")
	public void i_should_get_error_message(String ExpectedMsg) {
	    // Write code here that turns the phrase above into concrete actions
	    String ErrorMsg = driver.findElement(By.xpath("//div/h3")).getText();
	    Assert.assertEquals(ExpectedMsg, ErrorMsg);
	}
	

}
