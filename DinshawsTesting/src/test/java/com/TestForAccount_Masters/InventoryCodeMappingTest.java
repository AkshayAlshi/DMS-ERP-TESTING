package com.TestForAccount_Masters;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccount_Masters.InventoryCodeMappingPom;

import TestBase.TBase;

public class InventoryCodeMappingTest  extends TBase{

	
	
	 @BeforeTest
	    public void setup() throws Exception {
	    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-InventoryCodeMappingTest"), prop.getProperty("SubModuleXapath-InventoryCodeMappingTest"), prop.getProperty("FormSelection-InventoryCodeMappingTest"));
	    }

	    @Test
	    public void VerifyInventoryCodeMappingForm() throws InterruptedException, IOException {
	       
	                
	    			

	    	InventoryCodeMappingPom ICM = new InventoryCodeMappingPom(driver);
	    	
	    	ICM.SelectAccountDrop1();
	    	ICM.SelectAccountDrop2();
	    	ICM.SelectAccountDrop3();
	    	ICM.SelectAccountDrop4();
	    	ICM.SelectAccountDrop5();
	    	ICM.SelectAccountDrop6();
	    	ICM.SelectAccountDrop7();
	    	ICM.SelectAccountDrop8();
	    	ICM.SelectAccountDrop9();
	    	ICM.SelectAccountDrop10();
	    	ICM.SelectAccountDrop11();
	    
	    
	                
	    			
	          
	    }

	    @AfterTest
	    public void tearDown() {
//	        driver.quit();
	    }
	
	
}
