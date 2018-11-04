package com.qa.HTML;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.HTML.Constants;
import com.qa.HTML.HomePage;

public class Testing {

	WebDriver driver = null;
	HomePage homePage;
	JavascriptExecutor js;
	
	@Before 
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constants.htmlPage);
		homePage = PageFactory.initElements(driver, HomePage.class);
		js = (JavascriptExecutor) driver;
	}
	
	
	@Test
	public void numberTest() throws InterruptedException {

		js.executeScript("document.getElementsByClassName(\"inputbox\")[0].type = \"\";");

		homePage.enterText("abc");
		Thread.sleep(1000);
		homePage.clickSubmit();
		
		assertEquals("YOU HAVE DONE IT. Please enter your name.", homePage.doneTag().getText());
		Thread.sleep(1000);
		}

	
	@After
	public void tearDown() {
		driver.quit();
	}

}
