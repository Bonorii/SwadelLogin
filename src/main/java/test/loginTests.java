package test;

import org.testng.annotations.Test;

import baseContainer.loginbase;
import pages.loginp;
import utilities.utilities;

public class loginTests extends loginbase{
	@Test
	public void InvalidLogin() throws Exception {
		utilities utils = new utilities();
		loginp logn = new loginp(driver);
		
		logn.clickAvatarIcon();
		logn.clearEmailField();
		logn.typeinEmailField("invemail");
		logn.clearPasswordField();
		logn.typeinPasswordField("invpassword");
		logn.clickSubmitButton();
	}
	
	@Test
	public void ValidLogin() throws Exception {
		utilities utils = new utilities();
		loginp logn = new loginp(driver);
		
		logn.clickAvatarIcon();
		logn.clearEmailField();
		logn.typeinEmailField("email");
		logn.clearPasswordField();
		logn.typeinPasswordField("password");
		logn.clickSubmitButton();
	}
}
