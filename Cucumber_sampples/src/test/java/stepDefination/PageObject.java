package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	WebDriver driver;
	public PageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText="login.htm")
	public static WebElement signin;
	
	public void enter_name()
	{
		username.sendKeys("Lalitha");
	}
	public void enter_pass() 
	{
		password.sendKeys("Password123");
	}
	public void clickok()
	{
		login.click();
	}
	@FindBy(name="userName")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(name="Login")
	public static WebElement login;
}
