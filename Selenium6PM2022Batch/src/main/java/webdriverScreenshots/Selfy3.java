package webdriverScreenshots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy3 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		String link1 = driver.findElement(By.linkText("Images")).getText();
		System.out.println(link1);
		
		System.out.println("---------------------------");
		
		List<WebElement> links2 = driver.findElements(By.tagName("a"));
		for(int i=0;i<links2.size();i++)
		{
			String lnk = links2.get(i).getText();
			System.out.println(lnk);
		}
		
		System.out.println("----------------------------");
		
		List<WebElement> links3 = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for(int j=0;j<links3.size();j++)
		{
			String lk = links3.get(j).getAttribute("innerHTML");
			System.out.println(lk);
		}

	}

}
