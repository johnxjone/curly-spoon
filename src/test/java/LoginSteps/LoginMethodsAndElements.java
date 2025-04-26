package LoginSteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMethodsAndElements {
	
	
	@FindBy(xpath = "//*[@name='username']") WebElement USER;
	@FindBy(xpath = "//*[@name='password']") WebElement Pass;
	@FindBy(xpath="//*[@id='submit']") WebElement Submmit;
	
	public void User_Name_Pass_Word(String userValue,String userPass) {
		USER.sendKeys(userValue);
		Pass.sendKeys(userPass);
	}

	public void Submmit_log() {
		Submmit.click();
	}
}
