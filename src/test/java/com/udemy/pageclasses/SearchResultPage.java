package com.udemy.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends PageBase{

	private WebDriver dr;

	// By labelTotolItems = By.xpath("//span[contains(text(),'items found')]");
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'items found')]")
	WebElement labelTotolItems;

	public SearchResultPage(WebDriver dr) {
		super(dr);
		this.dr = dr;
		//PageFactory.initElements(dr, this);
	}

	public String getItemCount() {

		// return dr.findElement(labelTotolItems).getText();
		return labelTotolItems.getText();

	}

}
