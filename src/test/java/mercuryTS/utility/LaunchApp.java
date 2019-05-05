package mercuryTS.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.google.thirdparty.publicsuffix.PublicSuffixType;
import com.vishal.POMdemo.Config;

public class LaunchApp {
	Properties prop=new Properties();
	public void  openBrowser(String browsernm) throws IOException{
		FileInputStream fis=new FileInputStream("H:\\Basic Java\\Java projects\\POMdemo\\src\\test\\resources\\Config.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser1").equalsIgnoreCase(browsernm)){
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeexepath"));
			Config.driver=new ChromeDriver();
			System.out.println("Chrome is opened successfully");
		}
		else if(prop.getProperty("browser2").equalsIgnoreCase(browsernm)){
			System.setProperty("webdriver.ie.driver", prop.getProperty("ieexepath"));
			Config.driver=new InternetExplorerDriver();
			System.out.println("Internet Explorer is opened successfully");
		}
		else{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxexepath"));
			Config.driver=new FirefoxDriver();
			System.out.println("Fire fox is opened successfully");
		}
		
	}
	
	public void enterApplicationUrl(String url){
		Config.driver.get(url);
		System.out.println("url is entered successfully");
	}
	
	public void maximizeWindow(){
		Config.driver.manage().window().maximize();
		System.out.println("Window is maximized successfully");
	}
	
	public void closeBrowser(){
		Config.driver.close();
		System.out.println("Browser is closed successfully");
	}
}
