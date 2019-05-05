package mercuryTS.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.google.thirdparty.publicsuffix.PublicSuffixType;
import com.vishal.POMdemo.Config;

public class LoginPage {
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objUsername;
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objPassword;
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objLogin;
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objSignOff;
			
	public void loadLoginPage(){
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterUsername(String username){
		objUsername.sendKeys(username);
		System.out.println("username is entered successfully");
	}
	
	public void enterPassword(String password){
		objPassword.sendKeys(password);
	}
	
	public void clickLogin(){
		objLogin.click();
	}
	
	public void clickSignOff(){
		objSignOff.click();
	}

}
