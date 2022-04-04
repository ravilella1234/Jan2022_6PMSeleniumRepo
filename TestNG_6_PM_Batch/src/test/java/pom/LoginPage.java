package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(linkText="Sign in") public WebElement signIn;
	@FindBy(id="email")public WebElement userEmail;
	@FindBy(id="passwd")public WebElement userPassword;
	@FindBy(xpath="//*[@id='SubmitLogin']")public WebElement submitLogin;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")public WebElement loginError;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public void customerLogin()
	{
		signIn.click();
		userEmail.sendKeys("qatet767672@gmail.com");
		userPassword.sendKeys("password");
		submitLogin.click();
	}
	
	public String verifyError()
	{
		return loginError.getText();
	}
}
