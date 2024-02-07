package com.PomForAccount_Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class AccountEntityMappingPom  extends Base{

	
	
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[2]")
	WebElement Account1;
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[3]")
	WebElement Account2;
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[4]")
	WebElement Account3;
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[4]")
	WebElement Account4;
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[5]")
	WebElement Account5;
	
	
	
	public  AccountEntityMappingPom(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	
	public void ClickOnAccountCheck1() {
		Account1.click();
	}
	
	
	
	public void ClickOnAccountCheck2() {
		Account2.click();
	}
	
	public void ClickOnAccountCheck3() {
		Account3.click();
	}
	
	
	public void ClickOnAccountCheck4() {
		Account4.click();
	}
	
	
	public void ClickOnAccountCheck5() {
		Account5.click();
	}
	
	
	
	
}
