package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ObtainingTableDetails {
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");

		
		WebElement stock = driver.findElement(By.id("navbtn_stockmarket"));
		stock.click();
		WebElement nseBulk = driver.findElement(By.xpath("//a[text()='NSE Bulk Deals'and @class ='ch-bar-item ch-button']"));
		nseBulk.click();
		list<webElemet> tRow = driver.findElements(By.tagName("tr"));
		for(int i=0; i<tRow.size(); i++) {
			list<webElemet> tdata = tRow.get(i).findElements(By.tagName("td"));
			for(int j =0; j<tdata.size(); j++) {
				
				String secName = tdata.get(j).getText();
				System.out.println(secName);
			}
			
		}
		}
		
		
		
	}

