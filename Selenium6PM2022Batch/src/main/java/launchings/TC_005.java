package launchings;

public class TC_005 extends BaseTest
{
	public static void main(String[] args) throws Exception 
	{
		init();
		
		launcher("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("amazondropbox_id","Books");
		
		typeText("amazonsearchtext_id","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
		
		
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
	}

	

}
