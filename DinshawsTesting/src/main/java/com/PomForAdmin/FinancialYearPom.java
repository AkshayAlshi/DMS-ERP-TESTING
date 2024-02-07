package com.PomForAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;



public class FinancialYearPom   extends Base{

	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;
	
	
	@FindBy(xpath="//input[@type='number']")
	WebElement EnterYearCo;
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement Display;
	
	
	
	@FindBy(xpath="(//input[@role='combobox'])[1]")
	WebElement StartDate;
	
	
	
	@FindBy(xpath="(//input[@role='combobox'])[2]")
	WebElement EndDate;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[1]")
	WebElement IscurrentCheck;
	
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[5]")
	WebElement ClickOnMarchCheckBox;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	public FinancialYearPom(WebDriver Driver) {
		
		PageFactory.initElements(Driver,this);
	}
	
	
	public void AddButton() {
		
	 AddButton.click();

	}
	
	
	public void EnterYearCo(String year) {
		
		EnterYearCo.sendKeys(year);
	}

	
	
	
	public void EnterDisplay(String displayname) {
		Display.sendKeys(displayname);
	}
	
	
	
	
	public void EnterStartDate(String startDate) throws InterruptedException {
		StartDate.click();
		Thread.sleep(500);
		StartDate.sendKeys(startDate);
	}
	
	
	public void EnterEndDate(String enddate) {
		EndDate.sendKeys(enddate);
	}
	
	
	public void IscurrentCheck () {
		IscurrentCheck.click();
	}
	
	
	public void ClickOnMarchCheckBox() {
		ClickOnMarchCheckBox.click();
	}
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
