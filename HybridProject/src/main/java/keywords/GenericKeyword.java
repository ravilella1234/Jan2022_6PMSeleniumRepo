package keywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import reportings.ExtentManager;

public class GenericKeyword 
{
	public WebDriver driver;
	public String projectPath = System.getProperty("user.dir");
	public FileInputStream fis;
	public Properties mainProp;
	public Properties childProp;
	public Properties orProp;
	public ExtentTest test;
	public SoftAssert softAssert;

	public void openBrowser(String browserName)
	{
		//test.log(Status.INFO, "Opening Browser :" + childProp.getProperty(browserName));
		log("Opening Browser :" + childProp.getProperty(browserName));
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
		//test.log(Status.INFO, "Navigating to URL : " + childProp.getProperty(url));
		log("Navigating to URL : " + childProp.getProperty(url));
		driver.get(childProp.getProperty(url));
	}

	public  WebElement getElement(String locatorKey) 
	{
		WebElement element  = null;
		
		//check for presence of Element
		if(!isElementPresent(locatorKey))
			//report the failure
			System.out.println("Element is not present :" +locatorKey);
		
		element = driver.findElement(getLocator(locatorKey));

 		return element;
	}

	public  boolean isElementPresent(String locatorKey) 
	{
		//test.log(Status.INFO, "Checking the Element Presence :" + locatorKey);
		log("Checking the Element Presence :" + locatorKey);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public  By getLocator(String locatorKey)
	{
		By by=null;
		
		if(locatorKey.endsWith("_id")) {
			by = By.id(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_name")) {
			by = By.name(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_classname")) {
			by = By.className(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_linktext")) {
			by = By.linkText(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_partiallinktext")) {
			by = By.partialLinkText(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_xpath")) {
			by = By.xpath(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_css")) {
			by = By.cssSelector(orProp.getProperty(locatorKey));
		}
		
		return by;		
	}


	public void click(String locatorKey)
	{
		getElement(locatorKey).click();
	}
	
	public void type(String locatorKey,String textKey)
	{
		getElement(locatorKey).sendKeys(childProp.getProperty(textKey));
	}
	
	public void select(String locatorKey, String optionKey)
	{
		getElement(locatorKey).sendKeys(childProp.getProperty(optionKey));
	}
	
	public String getText() 
	{
		return null;
		
	}
	
	public void closeBrowser()
	{
		
	}
	
	public void setReport(ExtentTest test)
	{
		this.test = test;
	}
	
	//Reporting Function
	public void log(String msg)
	{
		test.log(Status.INFO, msg);
	}
	
	//Reporting Failure
	public void reportFailure(String failureMg,boolean stopOnFailure)
	{
		softAssert.fail(failureMg); // failure in TestNG Reports
		test.log(Status.FAIL, failureMg); // failure in Extent Reports
		takeScreenShot();
		
		if(stopOnFailure)
			assertAll();
	}
	
	public void assertAll()
	{
		Reporter.getCurrentTestResult().getTestContext().setAttribute("criticalFailure", "Y");
		softAssert.assertAll();
	}
	
	public void takeScreenShot()
	{
		// fileName of the screenshot
		Date d=new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
		// take screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			// get the dynamic folder name
			FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath+"//"+screenshotFile));
			//put screenshot file in reports
			test.log(Status.INFO,"Screenshot-> "+ test.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+"//"+screenshotFile));
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
