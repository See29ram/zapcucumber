package com.udemy.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase{

	private WebDriver dr;
	// WebElement Section
//	By eleUserName = By.id("ap_email");
//	By elePassWord = By.id("ap_password");
//	By eleSignIn = By.id("signInSubmit");
	
	@FindBy(id="ap_email")
	WebElement eleUserName;
	@FindBy(id="ap_password")
	WebElement elePassWord;
	@FindBy(id="signInSubmit")
	WebElement eleSignIn;

	public LoginPage(WebDriver dr) {
		super(dr);
		this.dr = dr;
		//PageFactory.initElements(dr, this);
	}

	// Navigate Section
	public PageBase SiginZappos(String userName, String passWord) {
//		dr.findElement(eleUserName).sendKeys(userName);
//		;
//		dr.findElement(elePassWord).sendKeys(passWord);
//		;
//		dr.findElement(eleSignIn).click();
		eleUserName.sendKeys(userName);
		elePassWord.sendKeys(passWord);
		eleSignIn.click();
		UserSearchPage userSearch=new UserSearchPage(dr);
		
		getWait().until(ExpectedConditions.elementToBeClickable(userSearch.eleSearchButton));
		return userSearch;
	}
	// Action/functionality Section
	// Create Account
	// ForgotPassword
	
	
}
