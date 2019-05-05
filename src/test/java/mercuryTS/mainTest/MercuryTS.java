package mercuryTS.mainTest;

import java.io.IOException;

import mercuryTS.page.LoginPage;
import mercuryTS.utility.LaunchApp;

public class MercuryTS {

	public static void main(String[] args) throws IOException {
		LaunchApp la=new LaunchApp();
		la.openBrowser("chrome");
		la.enterApplicationUrl("http://www.newtours.demoaut.com/");
		la.maximizeWindow();
		
		LoginPage lp=new LoginPage();
		lp.loadLoginPage();
		lp.enterUsername("Suvidyap1");
		lp.enterPassword("P@ssword1");
		lp.clickLogin();
		lp.clickSignOff();
		
		la.closeBrowser();

	}

}
