package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MFAPage {

	public MFAPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="smartphone_push_button")
	private WebElement sendMeaPushButton;
	
	@FindBy(id="otp-submit")
	private WebElement usePasscode;

	public WebElement getSendMeaPushButton() {
		return sendMeaPushButton;
	}

	public WebElement getUsePasscode() {
		return usePasscode;
	}
	
	public void mfaPush() {
		sendMeaPushButton.click();
	}
	public void usePasscode() {
		usePasscode.click();
	}
}
