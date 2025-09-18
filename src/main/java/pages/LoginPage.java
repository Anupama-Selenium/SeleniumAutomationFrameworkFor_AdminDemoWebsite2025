package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Page object model [POM] for UI interactions.

public class LoginPage 
{
    WebDriver driver;
	private By emailInputField = By.id("Email");
	private By passwordInputField = By.id("Password");
	private By loginButton = By.xpath("//button[text() = 'Log in']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUserName(String email)
	{
		driver.findElement(emailInputField).clear();
		driver.findElement(emailInputField).sendKeys(email);
	}
	public void enterPassword(String password)
	{
		driver.findElement(passwordInputField).clear();
		driver.findElement(passwordInputField).sendKeys(password);
	}
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}
}
