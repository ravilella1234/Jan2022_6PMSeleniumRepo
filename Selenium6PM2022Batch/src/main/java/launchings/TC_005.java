package launchings;

import org.apache.log4j.Logger;

public class TC_005 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_005.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Init the properties files....");
		
		launcher("chromebrowser");
		log.info("Opening the browser :-" + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigate to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		log.info("Selecting the Option Books By using locator :-" + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","Harry Potter");
		log.info("Enter the text Harry Potter By using locator :-" + orProp.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Element By using Locator : - " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
	}

	

}
