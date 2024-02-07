package com.TestForAccount_Masters;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccount_Masters.AccountEntityMappingPom;

import TestBase.TBase;

public class AccountEntityMappingTest extends TBase {

	
	
	
	 @BeforeTest
	    public void setup() throws Exception {
	    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-AccountEntityMappingTest"), prop.getProperty("SubModuleXapath-AccountEntityMappingTest"), prop.getProperty("FormSelection-AccountEntityMappingTest"));
	    }

	    @Test
	    public void VerifyAccountEntityMappingForm() throws InterruptedException, IOException {
	       
	                
	    			

	    	AccountEntityMappingPom AG = new AccountEntityMappingPom(driver);
	    	
	    	AG.ClickOnAccountCheck1();
	    	AG.ClickOnAccountCheck2();
	    	AG.ClickOnAccountCheck3();
	    	AG.ClickOnAccountCheck4();
	    	AG.ClickOnAccountCheck5();
	    
	    
	                
	    			
	          
	    }

	    @AfterTest
	    public void tearDown() {
//	        driver.quit();
	    }
	
	
}
