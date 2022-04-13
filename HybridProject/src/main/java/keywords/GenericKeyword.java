package keywords;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeyword 
{
	public WebDriver driver;
	public String projectPath = System.getProperty("user.dir");
	public FileInputStream fis;
	public Properties mainProp;
	public Properties childProp;
	public Properties orProp;

	public void openBrowser(String browserName)
	{
		System.out.println("Opening Browser :" + childProp.getProperty(browserName));
		if(childProp.getProperty(browserName).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(childProp.getProperty(browserName).equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	public void navigate(String url)
	{
		System.out.println("Navigating to URL : " + childProp.getProperty(url));
		driver.get(childProp.getProperty(url));
	}
	
	public void click(String locator)
	{
		
	}
	
	public void type(String locator,String text)
	{
		
	}
	
	public void select(String locator, String option)
	{
		
	}
	
	public String getText() 
	{
		return null;
		
	}
	
	public void closeBrowser()
	{
		
	}
	
}
