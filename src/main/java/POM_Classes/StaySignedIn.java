package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaySignedIn {

	public StaySignedIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="KmsiCheckboxField")
	private WebElement DontShowThisAgainCheckBox;

    @FindBy(id="idBtn_Back")
    private WebElement noButton;
    
    @FindBy(id="idSIButton9")
    private WebElement yesButton;

	public WebElement getDontShowThisAgainCheckBox() {
		return DontShowThisAgainCheckBox;
	}

	public WebElement getNoButton() {
		return noButton;
	}

	public WebElement getYesButton() {
		return yesButton;
	}
    
    public void clickOnYes() {
    	DontShowThisAgainCheckBox.click();
    	yesButton.click();
    }
    public void clickOnNo() {
    	DontShowThisAgainCheckBox.click();
    	noButton.click();
    }
}