package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverManager;

public class AccountCreationPage {
	private static AccountCreationPage accountCreation;
	public static AccountCreationPage getInstance() {
		if(accountCreation==null) {
			accountCreation=new AccountCreationPage();
		}
		return accountCreation;
	}
	public AccountCreationPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	@FindBy(name="firstName")
	private WebElement firstNameBox;
	
	@FindBy(id="lastName")
	private WebElement lastNameBox;
	
	@FindBy(id="email")
	private WebElement emailBox;
	
	@FindBy(id="fld-p1")
	private WebElement passwordBox;
	
	@FindBy(name="reenterPassword")
	private WebElement confirmPasswordBox;
	
	@FindBy(id="phone")
	private WebElement phoneNumberBox;
	
	@FindBy(xpath="//button[text()='Create an Account']")
	private WebElement createAnAccountButton;
	
	public WebElement getFirstNameBox() {
		return firstNameBox;
	}
	
	public WebElement getLastNameBox() {
		return lastNameBox;
	}
	
	public WebElement getEmailBox() {
		return emailBox;
	}
	
	public WebElement getPasswordBox() {
		return passwordBox;
	}
	
	public WebElement getConfirmPasswordBox() {
		return confirmPasswordBox;
	}
	
	public WebElement getPhoneNumberBox() {
		return phoneNumberBox;
	}
	public WebElement getCreateAnAccountButton() {
		return createAnAccountButton;
	}


}
