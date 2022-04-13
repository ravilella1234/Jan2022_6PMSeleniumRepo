package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ApplicationKeyword extends ValidationKeyword
{
	
	public ApplicationKeyword() throws Exception
	{
		mainProp = new Properties();
		childProp = new Properties();
		orProp = new Properties();
		
		try 
		{
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\environment.properties");
			mainProp.load(fis);
			String e = mainProp.getProperty("env");
			
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
			childProp.load(fis);
			
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\or.properties");
			orProp.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

	public void login()
	{
		
	}
	
	public void selectDateFormCalander()
	{
		
	}

}
