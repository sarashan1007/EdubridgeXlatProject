package ObjectRepository;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginPageOR {

	WebDriver driver;

	@FindBy(id = "login1")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(className = "signinbtn")
	WebElement signinbtn;

	@FindBy(linkText = "Forgot Password?")
	WebElement forgotPasswordLink;

	@FindBy(linkText = "Create a new account")
	WebElement createANewAccountLink;

	@FindBy(linkText = "Logout")
	WebElement logOutLink;

	// PageFactory
	// Create a constructor

	public LoginPageOR() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		PageFactory.initElements(driver, this);
	}

	public void launchApplication() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	public void closeBrowser() {
		driver.close();
	}

	public void enterUserName(String un) {
		username.sendKeys(un);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickButton() {
		signinbtn.click();
	}

	public void isForgotPasswordDisplay() {
		try {
			boolean forgotPwdStatus = forgotPasswordLink.isDisplayed();
			Assert.assertTrue(forgotPwdStatus);
		} catch (NoSuchElementException e) {
			Assert.assertTrue(false);
			System.out.println("Forgot password link is not displayed in application");
		}
	}

	public void isCreateANewAccountDisplay() {
		try {
			boolean createNewAccountStatus = createANewAccountLink.isDisplayed();
			Assert.assertTrue(createNewAccountStatus);
		} catch (NoSuchElementException e) {
			Assert.assertTrue(false);
			System.out.println("Create new account link is not displayed in application");
		}
	}

	public void isLogoutDisplay() {
		try {
			boolean logOutStatus = logOutLink.isDisplayed();
			Assert.assertTrue(logOutStatus);
		} catch (NoSuchElementException e) {
			Assert.assertTrue(false);
			System.out.println("Logout link is not displayed in application");
		}
	}
}