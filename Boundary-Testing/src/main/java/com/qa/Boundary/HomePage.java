package com.qa.Boundary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/form/div[1]/div[1]/input")
	private WebElement inputBox;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/form/div[1]/div[2]/input")
	private WebElement submitButton;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[3]/div/ul/li[1]")
	private WebElement listin;
	
	public WebElement textBox() {
		return inputBox;
	}
	
	public WebElement list() {
		return listin;
	}
	
	public void enterText(String text) { 
		inputBox.clear();
		inputBox.sendKeys(text);
	}
	
	public void clickSubmit() { 
		submitButton.click();
	}
	
	//Tests
	
	
	
	@FindBy(xpath = "//*[contains(text(), '31 days for 30 days months')]")
	WebElement days31;
	
	public WebElement testDays31() {
		return days31;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), '32 days for 31 days months')]")
	WebElement days32;
	
	public WebElement testDays32() {
		return days32;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'Inexistent date 29 for February 2017')]")
	WebElement feb29;
	
	public WebElement testFeb29() {
		return feb29;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'Date with day = zero')]")
	WebElement dateZero;
	
	public WebElement testDateZero() {
		return dateZero;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'First date after 2017, January 2018 00:00')]")
	WebElement newYear;
	
	public WebElement testNewYear() {
		return newYear;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'First date before 2017, December 2016 23:59')]")
	WebElement eve;
	
	public WebElement testEve() {
		return eve;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'March daylight saving time lowest invalid hour 02:00')]")
	WebElement lowMarch;
	
	public WebElement testLowMarch() {
		return lowMarch;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'Hour that exists twice during daylight saving time')]")
	WebElement twiceDaylight;
	
	public WebElement testTwiceDaylight() {
		return twiceDaylight;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'Date less than 1 hour')]")
	WebElement in1Hr;
	
	public WebElement testIn1Hr() {
		return in1Hr;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'March daylight saving time highest invalid hour 02:59')]")
	WebElement highMarch;
	
	public WebElement testHighMarch() {
		return highMarch;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'Hour bigger then maxim valid 24')]")
	WebElement maxim;
	
	public WebElement testMaxim() {
		return maxim;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'Maximum invalid value for minutes 60')]")
	WebElement mins60;
	
	public WebElement testMins60() {
		return mins60;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'Lower limit for the month 00')]")
	WebElement month00;
	
	public WebElement testMonth00() {
		return month00;
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(), 'Higher limit for the month 13')]")
	WebElement month13;
	
	public WebElement testMonth13() {
		return month13;
	}

}
