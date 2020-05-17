package com.udemy.factory;

import org.openqa.selenium.WebDriver;

import com.udemy.pageclasses.Favorites;
import com.udemy.pageclasses.HomePage;
import com.udemy.pageclasses.LoginPage;
import com.udemy.pageclasses.PageBase;
import com.udemy.pageclasses.SearchResultPage;
import com.udemy.pageclasses.UserSearchPage;

public class CustomFactory {

	public static PageBase getInstance(PageType type, WebDriver dr) {

		switch (type) {
		case HomePage:
			return new HomePage(dr);
		case LoginPage:
			return new LoginPage(dr);
		case SearchResultPage:
			return new SearchResultPage(dr);
		case UserSearchPage:
			return new UserSearchPage(dr);
		case Favorites:
			return new Favorites(dr);
        default:
        	throw new RuntimeException("Invalid Page");
		}

	}

}
