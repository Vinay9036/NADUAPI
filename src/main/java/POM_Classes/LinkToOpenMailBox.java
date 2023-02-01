package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utilitilies.BaseClass;

public class LinkToOpenMailBox extends BaseClass{

	public LinkToOpenMailBox(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'https://outlook.office.com/mail/vkc@akadevqa.mail.onmicrosoft.com')]")
	private WebElement clickOnLink;
	
	@FindBy(xpath="//div[contains(text(),'More details...')]")
	private WebElement moreDetails;
	
	public WebElement getMoreDetails() {
		return moreDetails;
	}
	public WebElement getClickOnLink() {
		return clickOnLink;
	}
	public void clickOnLink() {
		clickOnLink.click();
	}
	public void clickOnMoreDetails() {
		moreDetails.click();
	}
	
}
