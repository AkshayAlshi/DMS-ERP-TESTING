package com.PomForAccountsVoucher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class BankPaymentPom  extends Base {

	
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[3]")
	WebElement SeriesDrop;
	
	
	@FindBy(xpath="//span[text()=' BP ']")
	WebElement SelectSeries;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[10]")
	WebElement AccountDrop;
	
	
	
	@FindBy(xpath="//span[text()=' 11001100 ']")
	WebElement SelectAccount;
	
	
	
	
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement EnterVoucherAmount;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement EnterNaration;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[14]")
	WebElement TXNCodeDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' OTHER ']")
	WebElement SelectTxnCode;
	
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[17]")
	WebElement PaymentModeDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' Cheque ']")
	WebElement SelectPaymenetMode;
	
	
	
	
	
	@FindBy(xpath="(//input[@type='number'])[4]")
	WebElement EnterChequeNo;
	
	
	
	
	@FindBy(xpath="(//input[@role='combobox'])[11]")
	WebElement EnterChequeDate;
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[22]")
	WebElement DebitToAccountDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' 1274 ']")
	WebElement SelectDebityAccount;;
	
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	public BankPaymentPom  (WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	
	
}
