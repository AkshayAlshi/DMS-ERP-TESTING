package com.PomForAccount_Masters;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

 public class InventoryCodeMappingPom  extends TBase {

	
	 
	 
	 
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[3]")
	WebElement ClickOnAccountDrop1;
	
	
	@FindBy(xpath="//span[text()=' Test bank ']")
	WebElement SelectAccount1;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[5]")
	WebElement ClickOnAccountDrop2;
	
	
	
	@FindBy(xpath="//span[text()=' Test bank ']")
	WebElement SelectAccount2;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[7]")
	WebElement ClickOnAccountDrop3;
	
	
	
	@FindBy(xpath="//span[text()=' Test bank ']")
	WebElement SelectAccount3;
	
	
	
	 @FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[9]")
	 WebElement ClickOnAccountDrop4 ;
	
	
	
	
	@FindBy(xpath="//span[text()=' Test bank ']")
	WebElement SelectAccount4;
	
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[11]")
	WebElement ClickOnAccountDrop5;
	
	
	
	@FindBy(xpath="//span[text()=' Test bank ']")
	WebElement SelectAccount5;
	
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[13]")
	WebElement ClickOnAccountDrop6;
	
	
	@FindBy(xpath="//span[text()=' Test bank ']")
	WebElement SelectAccount6;
	
	
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[15]")
	WebElement ClickOnAccountDrop7;
	
	
	@FindBy(xpath="//span[text()=' Test bank ']")
	WebElement SelectAccount7;
	
	
	
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[17]")
	WebElement ClickOnAccountDrop8;
	
	
	
	@FindBy(xpath="//span[text()=' Test bank ']")
	WebElement SelectAccount8;
	
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[19]")
	WebElement ClickOnAccountDrop9;
	
	
	
	@FindBy(xpath="//span[text()=' Test bank ']")
	WebElement SelectAccount9;
	
	
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[21]")
	WebElement ClickOnAccountDrop10;
	
	
	
	@FindBy(xpath="//span[text()=' Test bank ']")
	WebElement SelectAccount10;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[23]")
	WebElement ClickOnAccountDrop11;
	
	
	@FindBy(xpath="//span[text()=' Test bank ']")
	WebElement SelectAccount11;
	
	public  InventoryCodeMappingPom(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	
	
	public void SelectAccountDrop1() throws InterruptedException {

//		ClickOnAccountDrop1.click();
		
		
		
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[3]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(500);
		
		SelectAccount1.click();
	}
	
	
	
	

	public void SelectAccountDrop2() throws InterruptedException {
		ClickOnAccountDrop2.click();
		
		
		Thread.sleep(500);
		
		SelectAccount2.click();
	}

	
	
	public void SelectAccountDrop3() throws InterruptedException {

		
		ClickOnAccountDrop3.click();
		
		Thread.sleep(500);
		
		SelectAccount3.click();
	}

	
	
	public void SelectAccountDrop4() throws InterruptedException {

		ClickOnAccountDrop4.click();
		
		Thread.sleep(500);
		
		SelectAccount4.click();
		
	}

	
	
	public void SelectAccountDrop5() throws InterruptedException {

		ClickOnAccountDrop5.click();
		
		Thread.sleep(500);
		
		SelectAccount5.click();
	}

	
	
	public void SelectAccountDrop6() throws InterruptedException {

		ClickOnAccountDrop6.click();
		
		Thread.sleep(500);
		
		SelectAccount6.click();
	}

	
	
	public void SelectAccountDrop7() throws InterruptedException {

		ClickOnAccountDrop7.click();
		
		Thread.sleep(500);
		
		SelectAccount7.click();
	}

	
	
	public void SelectAccountDrop8() throws InterruptedException {

		ClickOnAccountDrop8.click();
		
		Thread.sleep(500);
		
		SelectAccount8.click();
	}

	
	public void SelectAccountDrop9() throws InterruptedException {

		ClickOnAccountDrop9.click();
		
		Thread.sleep(500);
		
		SelectAccount9.click();
	}

	
	
	public void SelectAccountDrop10() throws InterruptedException {

		ClickOnAccountDrop10.click();
		
		Thread.sleep(500);
		
		SelectAccount10.click();
	}
	
	
	
	public void SelectAccountDrop11() throws InterruptedException {
		
		
		WebElement element = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[23]"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
		
		element.click();
		
		
//		ClickOnAccountDrop11.click();
		
		Thread.sleep(500);
		
		
		SelectAccount11.click();
		
	}
	
	
	


	
}
