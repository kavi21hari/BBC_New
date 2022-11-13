package com.page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBC_SoundsPage {
	private static BBC_SoundsPage bbcsoundsInstance;
		
		private BBC_SoundsPage() {
			
		}
		
		public static BBC_SoundsPage getInstance() {
			
			if(bbcsoundsInstance==null) {
			   bbcsoundsInstance=new BBC_SoundsPage();	
			}
			return bbcsoundsInstance;
		}

		@FindBy(xpath="(//*[@class='sc-c-sounds-nav__link-text gel-pica'])[1]")
	    private WebElement HomeLogo;
		public WebElement getHomeLogo() {
			return HomeLogo;
		}
		
		@FindBy(xpath="//*[@id='bbccookies-continue-button']")
	    private WebElement Cookie;
		public WebElement getCookie() {
			return Cookie;
		}
		
		@FindBy(xpath="(//*[@class='gel-layout__item sc-o-island'])[1]//div[3]")
	    private WebElement Radio1;
		public WebElement getRadio1() {
			return Radio1;
		}
		@FindBy(xpath="(//*[@class='gel-layout__item sc-o-island'])[5]//div[3]")
	    private WebElement Radio2;
		
		public WebElement getRadio2() {
			return Radio2;
		}
		@FindBy(xpath="(//*[@class='gel-brevier-bold sc-o-link sc-o-link--secondary'])[1]")
	    private WebElement StationSchedules;
		public WebElement getStationSchedules() {
			return StationSchedules;
		}
		@FindBy(xpath= "//*[@class='gel-layout__item sc-c-national-station-tile__station-image']//div//img")
	    private List<WebElement> StationLogos;
		public List<WebElement> getStationLogos() {
			return StationLogos;
		}
		
		@FindBy(xpath= "//*[@class='gs-u-display-block sc-o-link__text gel-great-primer-bold sc-u-truncate gs-u-mb-']")
	    private WebElement StationName;
		public WebElement getStationName() {
			return StationName;
		}
		
		
		
		@FindBy(xpath="//*[text()='Hip Hop, RnB & Dancehall']")
	    private WebElement HipHopCategory;
		public WebElement getHipHopCategory() {
			return HipHopCategory;
		}
		
		
		
		@FindBy(xpath="(//*[@class='sc-c-grid gs-u-box-size gs-u-mt+'])[4]//li")
	    private List<WebElement> Category;
		public  List<WebElement> getCategory() {
			return Category;
		}
			
		
		
		
		
		

		
	


}
