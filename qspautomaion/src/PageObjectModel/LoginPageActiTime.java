package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActiTime {
	
	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="logginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(xpath="") private WebElement linkActiTime;
	@FindBy(xpath="") private WebElement licenseLink;
	@FindBy(xpath="") private WebElement logoActiTime;
	
	//initialization
	
	public LoginPageActiTime(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getLinkActiTime() {
		return linkActiTime;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	public WebElement getLogoActiTime() {
		return logoActiTime;
	}
	
	
	//Operational method/
	
	public void validLogginActiTime(String validUsername, String validPassword) {
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginButton.click();
	}
	
	public void invalidLogginActiTime(String invalidUsername, String invalidPassword) throws InterruptedException {
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(4000);
		usn.clear();
	}
	
}
