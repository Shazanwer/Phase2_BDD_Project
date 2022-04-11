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
	public void launchSauceDemoApplication() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com");
	}

	@When("I enter the username {string} and the password {string}")
	public void inputUsernamePassword(String UserNameVal, String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user-name"));
		UserName.sendKeys(UserNameVal);
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys(PasswordVal);
	}

	@When("I click on the Login Button")
	public void clickLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("login-button"));
		LoginBtn.click();
	}

	@Then("I should land on the SWAG LABS page")
	public void insideHomePage() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Inside sauce demo app on SWAG LABS page");
	}

	@Then("I should get error message {string}")
	public void validateIncorrectLoginErrorMessage(String ExpectedMsg) {
	    // Write code here that turns the phrase above into concrete actions
	    String ErrorMsg = driver.findElement(By.xpath("//div/h3")).getText();
	    Assert.assertEquals(ExpectedMsg, ErrorMsg);
	}
	

}
