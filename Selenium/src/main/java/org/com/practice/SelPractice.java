package org.com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelPractice {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumLearning\\Selenium\\driver\\chromedriver.exe");
	
	ChromeDriver obj = new ChromeDriver();
	obj.get("https://www.linkedin.com/feed/");
	Thread.sleep(5000);
	
	obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	
	WebElement signIn = obj.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	signIn.click();
    WebElement username = obj.findElement(By.id("username"));
	WebElement password = obj.findElement(By.id("password"));
	
	username.sendKeys("sethujoe20@gmail.com");
	Thread.sleep(5000);
	password.sendKeys("nijanija");
	Thread.sleep(5000);
	WebElement finish = obj.findElement(By.xpath("//button[@aria-label='Sign in']"));
	finish.click();
	
	System.out.println(obj.findElement(By.id("ember86")).getText());
	
			System.out.println(obj.findElement(By.xpath("(//div[contains(@class,'entity-item')]//div[contains(@class,'ember-view') and contains(@id,'ember')])[1]//span")).getText());
			System.out.println(obj.findElement(By.xpath("(//button[contains(@id,'ember') and contains(@class,'artdeco-button') ])[9]")).getAttribute("aria-label"));
			
	
}
}
