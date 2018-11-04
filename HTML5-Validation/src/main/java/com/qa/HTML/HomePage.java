package com.qa.HTML;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath = "/html/body/div[2]/div/div/form/div/div/div/div/input")
	private WebElement inputBox;

	@FindBy(xpath = "/html/body/div[2]/div/div/form/input")
	private WebElement submitButton;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/form/div/div/div/div/span[1]/font")
	private WebElement done;
	
	public WebElement doneTag() {
		return done;
	}
	
	public WebElement textBox() {
		return inputBox;
	}
	
	public void enterText(String text) { 
		inputBox.sendKeys(text);
	}
	
	public void clickSubmit() { 
		submitButton.click();
	}
}
