package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverManager;

public class CreateAccountPage {
	private static CreateAccountPage createaccount;
	public static CreateAccountPage getInstance() {
		if(createaccount==null) {
			createaccount=new CreateAccountPage();
		}
		return createaccount;
	}
	public CreateAccountPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	@FindBy(xpath="//span[text()='Account']")
	private WebElement accountButton;
	
	@FindBy(xpath="//a[text()='Create Account']")
	private WebElement createAccountButton;
	
	
	public WebElement getAccountButton() {
		return accountButton;
	}
	
	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}
	
	
	

}
