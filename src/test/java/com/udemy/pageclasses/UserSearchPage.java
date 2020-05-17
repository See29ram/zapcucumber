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

public class UserSearchPage extends PageBase{

	private WebDriver dr;

	//By eleSearchBox = By.id("searchAll");
	//By eleSearchButton = By.xpath("//input[@id='searchAll']//following-sibling::button");
	
	@FindBy(how=How.ID,using="searchAll")
	WebElement eleSearchBox;
	@FindBy(xpath="//input[@id='searchAll']//following-sibling::button")
	WebElement eleSearchButton;

	public UserSearchPage(WebDriver dr) {
		super(dr);
		this.dr = dr;
		//PageFactory.initElements(dr, this);
	}
	
	public PageBase searchProduct(String product)
	{
		//dr.findElement(eleSearchBox).sendKeys(product);
		//dr.findElement(eleSearchButton).click();
		eleSearchBox.sendKeys(product);
		eleSearchButton.click();
		SearchResultPage searchResultpg=new SearchResultPage(dr);
		WebDriverWait wait=getWait();
		wait.until(ExpectedConditions.visibilityOf(searchResultpg.labelTotolItems));
		return searchResultpg;
	}
	


}
