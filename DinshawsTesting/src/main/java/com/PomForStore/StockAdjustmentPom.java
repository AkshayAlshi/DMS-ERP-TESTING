package com.PomForStore;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	WebElement DropResvers;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[8]")
	WebElement ItemDrop;
	
	
	@FindBy(xpath="//span[text()=' 9755 - ITEM3 ']")
	WebElement SelectItem;
	
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement SaveButton;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	public StockAdjustmentPom(WebDriver Driver ) {
		
		PageFactory.initElements( Driver, this );
	}
	
	public void SelectStockLocation() throws InterruptedException {
		
//		StockLocationDrop.click();
		
		
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[6]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(500);
		
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()=' Main Store ']"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", ele1);
//		SelectStockLocation.click();
        
        DropResvers.click();
	}
	
	
	
	public void SelectItem() throws InterruptedException {
		
		
		try {
			
			ItemDrop.click();
			
		} catch (Exception e) {
			
			WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[8]"));
	        JavascriptExecutor executor = (JavascriptExecutor)driver;
	        executor.executeScript("arguments[0].click();", ele);
		}
		Thread.sleep(500);
		
		
		
		
		
		try {
			SelectItem.click();
			
		} catch (Exception e) {
			// TODO: handle exception
			WebElement ele = driver.findElement(By.xpath("//span[text()=' 9755 - ITEM3 ']"));
	        JavascriptExecutor executor = (JavascriptExecutor)driver;
	        executor.executeScript("arguments[0].click();", ele);
	        
		}
		
	}
	
	
	
	public void ClickOnSaveButton() {
		SaveButton.click();
		
		
	}
	
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
		
	}
	
}
