
package keywords;

import org.openqa.selenium.support.ui.Select;

public class ValidationKeyword extends GenericKeyword
{
	
	 public void validateTitle()
	 {
		 
		 
	 }
	 
	 public void  validateText()
	 {
		
	 }
		
	 public void validateElementVisible()
	 {
		 // report failure
	 }
	 
	 public void validateSelectedValueInDropDown(String locatorKey, String option) {
			Select s = new Select(getElement(locatorKey));
			String text = s.getFirstSelectedOption().getText();
			if(!text.equals(option)){
				reportFailure("Option"+option+" not present in Drop Down "+locatorKey,true);
			}
			
		}
		
		public void validateSelectedValueNotInDropDown(String locatorKey, String option) {
			Select s = new Select(getElement(locatorKey));
			String text = s.getFirstSelectedOption().getText();
			if(text.equals(option)){
				reportFailure("Option"+option+" present in Drop Down "+locatorKey,true);
			}
			
		}

}
