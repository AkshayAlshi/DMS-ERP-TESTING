package com.TestcaseForStrore;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForStore.StockAdjustmentPom;

import TestBase.Base;

public class StockAdjustmentTest   extends Base  {

	
	   @BeforeTest
	    public void setup() throws Exception {
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-StockAdjustmentTest"), prop.getProperty("SubModuleXapath-StockAdjustmentTest"), prop.getProperty("FormNameXpath-StockAdjustmentTest"));
	    }

	    @Test
	    public void VerifyStockAdjustmentForm() throws InterruptedException, IOException {
	      
	    			

	    	StockAdjustmentPom SA = new StockAdjustmentPom(driver);
	    			
	    			
	    			SA.SelectStockLocation();
	    			SA.SelectItem();
	    			SA.ClickOnSaveButton();
	    			SA.ClickOnSubmitButton();
	     
	    }

	    @AfterTest
	    public void tearDown() {
//	        driver.quit();
	    }
	
	
}
