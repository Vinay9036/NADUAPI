package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generic_Utilitilies.BaseClass;

public class LoginInPage extends BaseClass{
	
	public LoginInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//span[text()='sign in']")
	private WebElement signInButton;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public void login() {
		usernameTextField.sendKeys("vkc");
		passwordTextField.sendKeys("P@ssw0rd@2021");
		signInButton.click();
	}
}
