package com.udemy.pageclasses;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.udemy.factory.CustomFactory;
import com.udemy.factory.PageType;

public class PageBase {

	private WebDriver dr;
	@FindBy(how = How.ID, using = "headerMyAccountDropdownToggle")
	WebElement eleMyAccount;
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement eleLogout;
	@FindBy(xpath = "//a[text()='Favorites']")
	WebElement eleFavorites;
	@FindBy(xpath = "//img[@alt='Welcome! Go to Zappos.com Homepage!']")
	WebElement homeZappos;

	public PageBase(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	protected WebDriverWait getWait() {
		WebDriverWait wait = new WebDriverWait(dr, 20);
		wait.ignoring(NoSuchElementException.class);
		return wait;
	}

	protected PageBase logOut() {
		HomePage homePage = new HomePage(dr);
		eleMyAccount.click();
		getWait().until(ExpectedConditions.elementToBeClickable(eleLogout)).click();
		return homePage;
	}

	protected PageBase getPageInstance(PageType type, WebDriver dr, WebElement we) {

		WebDriverWait wait = getWait();
		wait.until(ExpectedConditions.visibilityOf(we));

		return CustomFactory.getInstance(type, dr);

	}

}
