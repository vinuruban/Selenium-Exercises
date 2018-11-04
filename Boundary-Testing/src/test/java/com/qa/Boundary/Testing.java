package com.qa.Boundary;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.Boundary.Constants;
import com.qa.Boundary.HomePage;

public class Testing {

	WebDriver driver = null;
	int index = 0;
	WebElement baseTable;
	HomePage homePage;
	
	@Before
	public void setup() {
		System.setProperty(Constants.driverType, Constants.driverLocation);
		driver = new ChromeDriver();
		driver.get(Constants.htmlPage);
		homePage = PageFactory.initElements(driver, HomePage.class);
	}
	
	
	@Test
	public void testing_31_day_for_30_days_months() throws InterruptedException {
	
		homePage.enterText("31/11/2017 22:14"); 
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "31 days for 30 days months";
		String actual = homePage.testDays31().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void testing_32_day_for_31_days_months() throws InterruptedException {

		homePage.enterText("32/12/2017 22:13");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "32 days for 31 days months";
		String actual = homePage.testDays32().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void inexistent_date_29_for_february_2017() throws InterruptedException {

		homePage.enterText("29/02/2017 22:13");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "Inexistent date 29 for February 2017";
		String actual = homePage.testFeb29().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void date_with_day_zero() throws InterruptedException {

		homePage.enterText("00/11/2017 22:12");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "Date with day = zero";
		String actual = homePage.testDateZero().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void first_date_after_2017() throws InterruptedException {

		homePage.enterText("01/01/2018 00:00");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "First date after 2017, January 2018 00:00";
		String actual = homePage.testNewYear().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void first_date_before_2017() throws InterruptedException {

		homePage.enterText("31/12/2016 23:59");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "First date before 2017, December 2016 23:59";
		String actual = homePage.testEve().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void march_daylight_saving_time_lowest_invalid_hour() throws InterruptedException {

		homePage.enterText("26/03/2017 02:00");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "March daylight saving time lowest invalid hour 02:00";
		String actual = homePage.testLowMarch().getText();
		
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void hour_that_exists_twice_during_daylight_saving_time() throws InterruptedException {

		homePage.enterText("29/10/2017 03:00");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "Hour that exists twice during daylight saving time";
		String actual = homePage.testTwiceDaylight().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void date_less_than_1_hour() throws InterruptedException {

		homePage.enterText("31/12/2017 23:59");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "Date less than 1 hour";
		String actual = homePage.testIn1Hr().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void march_daylight_saving_time_highest_invalid_hour() throws InterruptedException {

		homePage.enterText("26/03/2017 02:59");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "March daylight saving time highest invalid hour 02:59";
		String actual = homePage.testHighMarch().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void hour_bigger_then_maxim_valid_24() throws InterruptedException {

		homePage.enterText("28/02/2017 24:00");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "Hour bigger then maxim valid 24";
		String actual = homePage.testMaxim().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void maximum_invalid_value_for_minutes_60() throws InterruptedException {

		homePage.enterText("01/01/2017 00:60");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "Maximum invalid value for minutes 60";
		String actual = homePage.testMins60().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void lower_limit_for_the_month_00() throws InterruptedException {

		homePage.enterText("03/00/2017 23:15");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "Lower limit for the month 00";
		String actual = homePage.testMonth00().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}
	
	@Test
	public void higher_limit_for_the_month_13() throws InterruptedException {

		homePage.enterText("03/13/2017 23:17");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		String expected = "Higher limit for the month 13";
		String actual = homePage.testMonth13().getText();
		
		assertEquals(expected, actual);
		Thread.sleep(1000);
		}

	
	@After
	public void tearDown() {
		driver.quit();
	}

}
