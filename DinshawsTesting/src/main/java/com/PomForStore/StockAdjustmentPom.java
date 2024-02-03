package com.PomForStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class StockAdjustmentPom extends Base {

	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[6]")
	WebElement StockLocationDrop;
	
	@FindBy(xpath="//span[text()=' Main Store ']")
	WebElement SelectStockLocation;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[7]")
	WebElement ItemDrop;
	
	
	@FindBy(xpath="//span[text()=' 9755 - ITEM3 ']")
	WebElement SelectItem;
	
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement SaveButton;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	public void StockAdjustmentPom(WebDriver Driver ) {
		
		PageFactory.initElements( Driver, this );
	}
	
	public void SelectStockLocation() throws InterruptedException {
		
		StockLocationDrop.click();
		
		Thread.sleep(500);
		
		SelectStockLocation.click();
	}
	
	
	
	public void SelectItem() throws InterruptedException {
		ItemDrop.click();
		
		Thread.sleep(500);
		
		
		SelectItem.click();
		
	}
	
	
	
	public void ClickOnSaveButton() {
		SaveButton.click();
		
	}
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
	
}
