package com.PomForAccountsVoucher;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class BankReceiptPom  extends TBase {

	
	
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[3]")
	WebElement SeriesDrop;
	
	
	@FindBy(xpath="//span[text()=' BR ']")
	WebElement SelectSeries;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[11]")
	WebElement AccountDrop;
	
	
	
	@FindBy(xpath="//span[text()=' 2023 ']")
	WebElement SelectAccount;
	
	
	
	
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement EnterVoucherAmount;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement EnterNaration;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[15]")
	WebElement TXNCodeDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' OTHER ']")
	WebElement SelectTxnCode;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[16]")
	WebElement CrossPaymenticon;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[17]")
	WebElement PaymentModeDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' RTGS ']")
	WebElement SelectPaymenetMode;
	
	
	
	
	
	@FindBy(xpath="(//input[@type='number'])[4]")
	WebElement EnterChequeNo ;
	
	
	
	
	@FindBy(xpath="(//input[@role='combobox'])[11]")
	WebElement EnterChequeDate;
	
	
	
	
	@FindBy(xpath="(//input[@role='combobox'])[13]")
	WebElement CreditToAccountDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' 1274 ']")
	WebElement SelectCreditToAccount;
	
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	public BankReceiptPom  (WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	
	
	public void ClickOnCreateButton() {
		CreateButton.click();
	}
	
	
	
	public  void SelectSeries() throws InterruptedException {
		SeriesDrop.click();
		
		Thread.sleep(500);
		
		SelectSeries.click();
		
	}
	
	
	
	
	
	public void SelectAccount() throws InterruptedException {
		AccountDrop.click();
		
		
		
		
		Thread.sleep(500);
		
		
		
		SelectAccount.click();
	}
	
	
	
	public void EnterVoucherAmount(String voucheramount) {
		EnterVoucherAmount.sendKeys(voucheramount);
		
		
	}
	
	
	public void EnterNaration(String naration) {
		EnterNaration.sendKeys(naration);
	}
	
	
	public void SelctTXNCode() throws InterruptedException {
		TXNCodeDrop.click();
		
		Thread.sleep(500);
		
		
		SelectTxnCode.click();
		
	}
	
	
	
	public void SelectPaymentMode() throws InterruptedException {
		
		
		
	
		Thread.sleep(500);
		PaymentModeDrop.click();
		
		
		
		Thread.sleep(500);
		
		SelectPaymenetMode.click();
		
		
		
		
	}
	
	
	
	
	public void EnterChequeNo(String chequeno) {
		
		EnterChequeNo.sendKeys(chequeno);
		
		
	}
	
	
	
	public void EnterChequeDate(String chequedate) throws InterruptedException {
		
		EnterChequeDate.click();
		
		Thread.sleep(500);
		
		EnterChequeDate.sendKeys(chequedate);
		
	}
	
	
	public void SelectDebitToAccount() throws InterruptedException {
//		DebitToAccountDrop.click();
		
		
		
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[22]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(500);
		
		SelectCreditToAccount.click();
	}
	
	
	
	
	
	public void ClickOnSubmitButton() {
		
		ClickOnSubmitButton.click();
	}
	
	
}
