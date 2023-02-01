package TestScriptsForM365;

import org.testng.annotations.Test;

import Generic_Utilitilies.BaseClass;
import POM_Classes.HomePage;
import POM_Classes.LinkToOpenMailBox;
import POM_Classes.LoginInPage;
import POM_Classes.MFAPage;
import POM_Classes.SignInPage;
import POM_Classes.StaySignedIn;

public class SendMailFromOnlineToOnpremAccount extends BaseClass{

	@Test
	public void sendEmail() {
		LoginInPage lin=new LoginInPage(driver);
		lin.login();
		
		LinkToOpenMailBox link=new LinkToOpenMailBox(driver);
		link.clickOnLink();
		
		SignInPage sin=new SignInPage(driver);
		sin.enterEmail();
		
		MFAPage mfa=new MFAPage(driver);
		mfa.mfaPush();
		
		StaySignedIn stay=new StaySignedIn(driver);
		stay.clickOnYes();
		
		HomePage hm=new HomePage(driver);
		hm.sendMail();
		hm.verifyMailIsSent();
		hm.logout();
		
	}
}
