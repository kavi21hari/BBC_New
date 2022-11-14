package com.stepdefinition;

import com.constant.Constant;
import com.page_object.BBC_SoundsPage;
import com.webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class BBC_SoundsStepDefinition {

	@Given("that I am on the BBC Sounds Homepage and accept the cookies")
	public void that_i_am_on_the_bbc_sounds_homepage_and_accept_the_cookies() {
		DriverManager.getDriver().get(Constant.APP_URL);
		BBC_SoundsPage.getInstance().getCookie().click();

	}

	@When("I select the ‘ Home’ logo")
	public void i_select_the_home_logo() {
		BBC_SoundsPage.getInstance().getHomeLogo().click();

	}

	@Then("I am on the Sounds Homepage")
	public void i_am_on_the_sounds_homepage() {

		String actualTitle = DriverManager.getDriver().getTitle();
		System.out.println("Title is" + actualTitle);

		// Verify actual to Expected Result
		String expectedTitle = Constant.PAGETITLE;
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Actual is eqal to expectedtitle ");

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("pass");

		} else {
			System.out.println("fail");

		}
	}

	@Then("I can see the Radio 1 & 2 logo")
	public void i_can_see_the_radio_logo() {

		WebElement radio1LogoPresent = BBC_SoundsPage.getInstance().getRadio1();
		Assert.assertTrue("Valdiate radio one is present", radio1LogoPresent.isDisplayed());

		WebElement radio2LogoPresent = BBC_SoundsPage.getInstance().getRadio2();
		Assert.assertTrue("Valdiate radio one is present", radio2LogoPresent.isDisplayed());

	}

	@When("I click the ‘View all Stations & Schedules’ link")
	public void i_click_the_view_all_stations_schedules_link() {
		BBC_SoundsPage.getInstance().getStationSchedules().click();

	}

	@Then("I am on the ‘Stations’ page")
	public void i_am_on_the_stations_page() {

		String actualUrl = DriverManager.getDriver().getCurrentUrl();
		System.out.println("Current Station Page Url is" + actualUrl);

		// Verify actual to Expected Result
		String expectedUrl = Constant.SOUNDPAGETITLE;
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Actual is eqal to expectedUrl ");

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("pass");

		} else {
			System.out.println("fail");

		}

	}

	@Then("I see {int} network station logos")
	public void i_see_network_station_logos(Integer int1) {

		List<WebElement> list = BBC_SoundsPage.getInstance().getStationLogos();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Radio List" + list.size());

		for (int i = 1; i < list.size(); i++) {
			boolean b = list.get(i).isDisplayed();
			WebElement Name = DriverManager.getDriver().findElement(By.xpath(
					"(//*[@class='gs-u-display-block sc-o-link__text gel-great-primer-bold sc-u-truncate gs-u-mb-'])["
							+ i + "]"));

			if (b = true) {

				System.out.println("Logo is prestent " + Name.getText());
			} else {
				System.out.println("Logo is not prestent " + Name.getText());
			}

		}

	}

	@When("I select Hip Hop, RnB & Dancehall Category")
	public void i_select_hip_hop_rn_b_dancehall_category() {
		BBC_SoundsPage.getInstance().getHipHopCategory().click();

	}

	@Then("I am on ‘Hip Hop, RnB & Dancehall’ Category page")
	public void i_am_on_hip_hop_rn_b_dancehall_category_page() {

		String actualTitle = DriverManager.getDriver().getTitle();
		System.out.println("Current Station Page Title is" + actualTitle);

		// Verify actual to Expected Result String expectedHeading =
		String expectedTitle = Constant.CATEGORYPAGETITLE;
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Actual is eqal to expected ");

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("pass");

		} else {
			System.out.println("fail");

		}

		DriverManager.getDriver().navigate().back();

	}

	@Then("I see the Category page is sorted by popular")
	public void i_see_the_category_page_is_sorted_by_popular() {

		List<WebElement> list = BBC_SoundsPage.getInstance().getCategory();
		System.out.println("Radio List" + list.size());

		for (int i = 1; i < list.size(); i++) {
			boolean b = list.get(i).isDisplayed();
			WebElement s = DriverManager.getDriver().findElement(
					By.xpath("(((//*[@class='sc-c-grid gs-u-box-size gs-u-mt+'])[4]//li//div[@class='sc-o-island'])["
							+ i + "]//div)[4]"));

			if (b = true) {
				System.out.println("Category is sort by popular" + s.getText());
			} else {
				System.out.println("Category is not sort by popular" + s.getText());
			}

		}
	}
}
