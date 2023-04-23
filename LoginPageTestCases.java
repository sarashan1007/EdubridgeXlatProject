package stepDefinitions;

import ObjectRepository.LoginPageOR;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTestCases {
	
	LoginPageOR obj = new LoginPageOR();

	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
	   obj.launchApplication(); 
	    
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() throws InterruptedException {
	    obj.enterUserName("soundharyasenthil1007");
	    obj.enterPassword("Baby@2023oct");
		Thread.sleep(2000);
	}
	@When("click on signin button")
	public void click_on_signin_button() throws InterruptedException {
	    obj.clickButton();
	    Thread.sleep(2000);
	}

	@Then("user should be able to logged in")
	public void user_should_be_able_to_logged_in() throws InterruptedException {
	    obj.isLogoutDisplay();
	    Thread.sleep(2000);
	    }

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
	    obj.closeBrowser();
	    Thread.sleep(2000);
	}

	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() throws InterruptedException {
		obj.enterUserName("soundharyasenthil1007");
	    obj.enterPassword("S1234$");
	    Thread.sleep(2000);
	}

	@Then("user should not be able to logged in")
	public void user_should_not_be_able_to_logged_in() throws InterruptedException {
		obj.isForgotPasswordDisplay();
		Thread.sleep(2000);
	    
	}

	@Then("forgot password link should be displayed in login page")
	public void forgot_password_link_should_be_displayed_in_login_page() throws InterruptedException {
		obj.isForgotPasswordDisplay();
		Thread.sleep(2000);
	    
	}

	@Then("create new account link should be displayed in login page")
	public void create_new_account_link_should_be_displayed_in_login_page() throws InterruptedException {
		obj.isCreateANewAccountDisplay();
		Thread.sleep(2000);
	}

}
