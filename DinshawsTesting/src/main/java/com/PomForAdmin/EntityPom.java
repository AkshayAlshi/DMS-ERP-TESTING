package com.PomForAdmin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class EntityPom  extends Base{

	
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement EntityName;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement PrintName;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon ng-star-inserted'])[1]")
	WebElement CurrenyDrop;
	
	
	
	@FindBy(xpath="//span[text()=' INR ']")
	WebElement SelectCurrency;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon ng-star-inserted'])[1]")
	WebElement ReversDrop;
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon ng-star-inserted'])[2]")
	WebElement TypeDrop;
	
	
	
	@FindBy(xpath="//span[text()=' ORGANIZATION ']")
	WebElement SelectType;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon ng-star-inserted'])[3]")
	WebElement StoreDrop;
	
	
	
	@FindBy(xpath="//span[text()=' Butibori Store ']")
	WebElement SelectStore;
	
	
	
	
	@FindBy(xpath="//textarea[@class='ng-pristine igx-input-group__textarea ng-star-inserted ng-invalid ng-touched']")
	WebElement EnterAddress;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement EnterCity;
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[10]")
	WebElement CountryDrop ;
	
	
	
	@FindBy(xpath="(//span[text()=' INDIA '])[2]")
	WebElement SelectCountry;
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[11]")
	WebElement StateDrop;
	
	
	
	@FindBy(xpath="//span[text()=' MAHARASHTRA ']")
	WebElement SelectState;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement EnterPinNo;
	
	
	
	@FindBy(xpath="//span[@class='igx-checkbox__composite']")
	WebElement SomeAsContactAddressCheck;
	
	
	
	
	
	@FindBy(xpath="//span[text()='Contact Information']")
	WebElement ClicknContactInfoTab;
	
	
	
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement ContactPerson;
	
	
	
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement EnterPhone1;
	
	
	
	@FindBy(xpath="(//input[@type='email'])[1]")
	WebElement EnterEmail1;
	
	
	
	
	@FindBy(xpath="(//input[@type='email'])[2]")
	WebElement EnterEmail2;
	
	
	
	@FindBy(xpath="(//input[@type='email'])[3]")
	WebElement EnterEmail3;
	
	
	
	@FindBy(xpath="//span[text()='Registration Information']")
	WebElement  ClickOnRegistrationInformation;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement PFNumber;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	WebElement PanNumber;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[9]")
	WebElement GSTtypeDrop;
	
	
	
	@FindBy(xpath="//span[text()=' Registered ']")
	WebElement SelectGSTtpe;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	WebElement EnterGSTNumber;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement SubmitButton;
	
	
	
	
	
	
	public EntityPom(WebDriver Driver) {
		PageFactory.initElements(Driver, this );
	}
	
	
	
	public void  ClickOnCreateButton() {
		
		CreateButton.click();
	}
	
	
	public void EnterEntityName(String entityname) {
		
		EntityName.sendKeys(entityname);
	}
	
	
	public void SelectCurrency() throws InterruptedException {
		CurrenyDrop.click();
		
		Thread.sleep(500);
		
		SelectCurrency.click();
		
		Thread.sleep(500);
//		ReversDrop.click();
	}
	
	
	
	public void SelectType() throws InterruptedException {
		TypeDrop.click();
		
		Thread.sleep(500);
		
		
		SelectType.click();
	}
	
	
	
	public void SelectStore() throws InterruptedException {
		StoreDrop.click();
		
		Thread.sleep(500);
		
		SelectStore.click();
	}
	
	
	public void EnterAddress(String address) {
		EnterAddress.sendKeys(address);
	}
	
	
	
	public void EnterCity(String city) {
		EnterCity.sendKeys(city);
	}
	
	
	
	public void SelectCountry() throws InterruptedException {
		CountryDrop.click();
		
		Thread.sleep(500);
		
	
		SelectCountry.click();
	}
	
	
	
	    public void SelectState() throws InterruptedException {
		
	    	StateDrop.click();
	    	
	    	Thread.sleep(500);
	    	
	    	
	    	SelectState.click();
	    	
	}
	
	    
	    
	    public void EnterPin(String pin) {
	    	EnterPinNo.sendKeys(pin);
	    	
	    }
	    
	    
	    public void ClickOnSameAsContactAddCheck() {
	    	SomeAsContactAddressCheck.click();
	    }
	    
	    
	    
	    public void ClicKoNContactInformationTAB() {
	    	ClicknContactInfoTab.click();
	    }
	    
	    
	    public void EnterContactPerson(String contactperson) throws InterruptedException {
	    	ContactPerson.sendKeys(contactperson);
	    	
	    
	    	Thread.sleep(500);
	    	
	    	ContactPerson.sendKeys(Keys.TAB);
	    	
	    }
	    
	    
	    
	    public void EnterPhone1(String phoneno1) {
	    	EnterPhone1.sendKeys(phoneno1);
	    }
	    
	    
	    
	    
	    public void EnterEmail1(String email1) { 
	    	EnterEmail1.sendKeys(email1);
	    }
	    
	    
	    public void EnterEmail2(String email2) {
	    	EnterEmail2.sendKeys(email2);
	    }
	    
	    
	    public void EnterEmail3(String email3) {
	    	EnterEmail3.sendKeys(email3);
	    }
	    
	    
	    public  void ClickOnRegistrationInformationTab() {
	    	ClickOnRegistrationInformation.click();
	    }
	    
	    
	    public void EnterPFNumber(String pfnumber) {
	    	PFNumber.sendKeys(pfnumber);
	    }
	    
	    
	    public void EnterPanNo(String panNumber) {
	    	PanNumber.sendKeys(panNumber);
	    }
	    
	    
	    
	    public void SelectGstType() throws InterruptedException {
	    	GSTtypeDrop.click();
	    	
	    	
	      Thread.sleep(500);
	      
	      
	      SelectGSTtpe.click();
	      
	    }
	    
	    
	    
	    public void EnterGSTNO(String gstnumber) {
	    	EnterGSTNumber.sendKeys(gstnumber);    }
	    
	   
	    
	    
	    public void ClickOnSubmitButton() {
	    	SubmitButton.click();
	    }
	    
	    
}
