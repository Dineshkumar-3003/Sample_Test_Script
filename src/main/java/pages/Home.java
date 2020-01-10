package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Page_Objects.*;

public class Home extends BasePage {

	public Home(WebDriver driver) {
		super(driver);
	}

	public Home App_Launch(String URL) {
		driver.get(URL);
		return this;
	}

	public Home Verify_Text(String Available_Text) throws Exception {

		Assert.assertEquals(Available_Text, readText(PO_Home.Message));
		return this;
	}

}