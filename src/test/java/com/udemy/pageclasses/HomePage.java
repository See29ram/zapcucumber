package com.udemy.pageclasses;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase{

//	By edtHomeSearch = By.id("searchAll");
//	By signInButton = By.linkText("Sign In / Register");
//	By signInOptionZappos = By.xpath("//a[text()='Sign in with Zappos']");
//	By signInOptionAmazon = By.partialLinkText("Sign in with Amazon");

	@FindBy(how=How.ID,using="searchAll")
	WebElement edtHomeSearch;
	
	@FindBy(how=How.LINK_TEXT,using="Sign In / Register")
	WebElement signInButton;
	
	@FindBy(how=How.XPATH,using="//a[text()='Sign in with Zappos']")
	WebElement signInOptionZappos;
	
	private WebDriver dr;

	public HomePage(WebDriver dr) {
		super(dr);
		this.dr = dr;
		//PageFactory.initElements(dr, this);
	}

	public void SearchInHome() {

	}

	public PageBase navigateLoginPage() {
		LoginPage loginPg = new LoginPage(dr);
		//dr.findElement(signInButton).click();
		//dr.findElement(signInOptionZappos).click();
		signInButton.click();
		signInOptionZappos.click();
		WebDriverWait wait = getWait();
		wait.until(ExpectedConditions.visibilityOf(loginPg.eleSignIn));
        return loginPg;
	}

	

}
