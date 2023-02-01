package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utilitilies.BaseClass;

public class HomePage extends BaseClass{

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='New mail']")
	private WebElement newMailButton;
	
	@FindBy(xpath="//div[@aria-label='To']")
	private WebElement to;
	
	@FindBy(xpath="//div[@aria-label='Cc']")
	private WebElement cc;
	
	@FindBy(xpath="//input[@placeholder='Add a subject']")
	private WebElement subTextfield;
	
	@FindBy(xpath="//div[contains(@aria-label,'Message body')]")
	private WebElement bodyTextField;
	
	@FindBy(xpath="//span[text()='Send']")
	private WebElement sendButton;
	
	@FindBy(id="meInitialsButton")
	private WebElement profileIcon;
	
	@FindBy(xpath="//div[text()='Sign in with a different account']")
	private WebElement signInWithDiffAccount;
	
	@FindBy(id="mectrl_body_signOut")
	private WebElement signoutButton;
	
	@FindBy(xpath="//span[text()='Sent Items']")
	private WebElement sendItem;
	
	@FindBy(xpath="(//div[@class='XG5Jd JtO0E'])[1]")
	private WebElement verifysentMail;
	
	@FindBy(xpath="//span[@class='OZZZK']")
	private WebElement MailSentFrom;
	
	@FindBy(xpath="//div[@class='tVyQ7']")
	private WebElement toAndcc;
	
	@FindBy(xpath="//div[@class='x_elementToProof']")
	private WebElement messageBody;

	public WebElement getMailSentFrom() {
		return MailSentFrom;
	}

	public WebElement getToAndcc() {
		return toAndcc;
	}

	public WebElement getMessageBody() {
		return messageBody;
	}

	public WebElement getVerifysentMail() {
		return verifysentMail;
	}

	public WebElement getSendItem() {
		return sendItem;
	}

	public WebElement getSignoutButton() {
		return signoutButton;
	}

	public WebElement getProfileIcon() {
		return profileIcon;
	}

	public WebElement getSignInWithDiffAccount() {
		return signInWithDiffAccount;
	}

	public WebElement getNewMailButton() {
		return newMailButton;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getSubTextfield() {
		return subTextfield;
	}

	public WebElement getBodyTextField() {
		return bodyTextField;
	}

	public WebElement getSendButton() {
		return sendButton;
	}
	
	public void sendMail() {
		newMailButton.click();
		to.sendKeys("EXOTestUser13@akadevqa.com");
		cc.sendKeys("EXOTestUser14@akadevqa.com");
		subTextfield.sendKeys("Sending Mail from online to onprem account");
		bodyTextField.sendKeys("DEMO");
		sendButton.click();
	}
	public void signInWithDifferentAccount() {
		profileIcon.click();
		signInWithDiffAccount.click();
	}
	public void logout() {
		profileIcon.click();
		signoutButton.click();
	}
	public void verifyMailIsSent() {
		sendItem.click();
		verifysentMail.click();
		System.out.println("From :"+ MailSentFrom.getText());
		System.out.println("To & Cc :"+ toAndcc.getText());
		System.out.println("Message Body :"+ messageBody.getText());
		
	}
}
