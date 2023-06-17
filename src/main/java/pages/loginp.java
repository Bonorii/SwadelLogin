package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseContainer.loginbase;
import utilities.utilities;

public class loginp extends loginbase{
	utilities utils = new utilities();
	
	String homePageAvatarIcon = OR.getProperty("avatarIcon");
	String emailField = OR.getProperty("emailField");
	String passwordField = OR.getProperty("passwordField");
	String SubmitBtn = OR.getProperty("SubmitBtn");
	
	public loginp(WebDriver driver) {
		loginbase.driver = driver;
		PageFactory.initElements(loginbase.driver, this);
	}

	public void clickAvatarIcon () {
		driver.findElement(By.cssSelector(homePageAvatarIcon)).click();
	}
	
	public void clickEmail() {
		driver.findElement(By.id(emailField)).click();
	}
	
	public void typeinEmailField(String key) throws Exception {
		driver.findElement(By.id(emailField)).sendKeys(utils.dataFetcher(key));
	}
	
	public void clearEmailField() {
		driver.findElement(By.id(emailField)).clear();
	}
	
	public void clickPassword() {
		driver.findElement(By.id(passwordField)).click();
	}
	
	public void typeinPasswordField(String key) throws Exception {
		driver.findElement(By.id(passwordField)).sendKeys(utils.dataFetcher(key));
	}
	
	public void clearPasswordField() {
		driver.findElement(By.id(passwordField)).clear();
	}
	
	public void clickSubmitButton() {
		driver.findElement(By.name(SubmitBtn)).click();
	}
}
