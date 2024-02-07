package com.PomForAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class RolesAndPermissionsPOM   extends  Base  {

	
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement EnterRoleName;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[2]")
	WebElement DepartmentDrop;
	
	
	
	@FindBy(xpath="//span[text()=' QA1  ']")
	WebElement SelectDepartment;
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[1]")
	WebElement isSystemCheck;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[2]")
	WebElement ViewCheckBox;
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[13]")
	WebElement NewCheckBox;
	
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[19]")
	WebElement EditCheckBox;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	public RolesAndPermissionsPOM(WebDriver Driver) {
		
		PageFactory.initElements(Driver,this );
	}
	
	
	public void ClickOnAddButton() {
		AddButton.click();
	}
	
	
	public void EnterRoleName(String rolename) {
		EnterRoleName.sendKeys(rolename);
	}
	
	
	public void SelectDepartment() throws InterruptedException {
		DepartmentDrop.click();
		
		Thread.sleep(500);
		
		SelectDepartment.click();
	}
	
	
	public void isSystemCheck() {
		boolean result=isSystemCheck.isSelected();
		System.out.println(result);
	}
	
	
	
	public void ClickOnViewCheck() {
		ViewCheckBox.click();
	}
	
	
	
	public void ClickOnNewCheck() {
		NewCheckBox.click();
	}
	
	
	public void ClickOnEditCheckBox() {
		EditCheckBox.click();
	}
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
	
	
}
