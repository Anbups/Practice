package driverManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import uttility.UttilityClass;

public class DriverManager {
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DriverManager.driver = driver;
	}
   private static DriverManager driverManager;
   public static DriverManager getInstance() {
	   if(driverManager==null) {
		   driverManager=new DriverManager();
	   }
	return driverManager;
	   
   }
   public void launchBrowser() throws IOException {
	   switch(UttilityClass.getInstance().readPropertyFile("browser")) {
	   case "chrome":
		   driver=new ChromeDriver();
		   break;
	   case "edge":
		   driver=new EdgeDriver();
		   break;
	   case "firefox":
		   driver=new FirefoxDriver();
		   default:
			   driver=new ChromeDriver();
			   break;
			   
	   }
   }
   
}
