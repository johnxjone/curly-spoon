package Step.Def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import LoginSteps.Hooked;
import LoginSteps.LoginMethodsAndElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefination {
	
	WebDriver driver;
	LoginMethodsAndElements	LoginMethodsAndElementsObj;
	
	public Stepdefination() {
		
		this.driver = Hooked.getDriver();	
		//driver.get("practicetestautomation.com/practice-test-login");
		LoginMethodsAndElementsObj= PageFactory.initElements(driver,LoginMethodsAndElements.class);
		
		
	}
	
	@Given("user shoud lanch the {string} of Broser")
	public void user_shoud_lanch_the_of_broser(String url) {
		
		driver.get(url);
		 
	}

	@Given("user shoud mentiond User neme {string} and password {string}")
	public void user_shoud_mentiond_user_neme_and_password(String string, String string2) {
		
		LoginMethodsAndElementsObj.User_Name_Pass_Word(string, string2);
	    	}

	@When("Click to login")
	public void click_to_login() {
		
		LoginMethodsAndElementsObj.Submmit_log();
	    
	}

}
