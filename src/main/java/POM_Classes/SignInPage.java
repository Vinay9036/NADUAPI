package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="loginfmt")
	private WebElement email;
	
	@FindBy(id="idSIButton9")
	private WebElement nextButton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNextButton() {
		return nextButton;
	}
	
	public void enterEmail() {
		email.sendKeys("vkc@akadevqa.com");
		nextButton.click();
	}
	public void enterAnotherEmail() {
		email.sendKeys("EXOTestUser13");
		nextButton.click();
	}
}
