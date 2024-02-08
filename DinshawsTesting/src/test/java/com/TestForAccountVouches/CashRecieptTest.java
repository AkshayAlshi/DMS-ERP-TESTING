package com.TestForAccountVouches;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccountsVoucher.BankReceiptPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class CashRecieptTest extends TBase {

	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
	    String sheetName ="BankReceiptTest";
	    int rowCount;
	    int colCount;

	    public CashRecieptTest() throws IOException {
	        super();
	        
	    }
	    

	    
	    
	    @BeforeTest
	    public void setup() throws Exception {
	    	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Accounts.Properties");
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-BankReceiptTest"), prop.getProperty("SubModuleXapath-BankReceiptTest"), prop.getProperty("FormSelection-BankReceiptTest"));
	    }

	    @Test
	    public void VerifyBankPaymentTestForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 1; rowNum++) {
	                int colNum = 0;

	                String VoucherAmount = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                String Naration = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
	                String ChequeNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);
//	                String CostCenter = reader.getCellData(sheetPath, sheetName, rowNum, colNum+3);
	                
	                
	    			

	                BankReceiptPom BP = new BankReceiptPom(driver);

	                
	                BP.ClickOnCreateButton();
	                BP.SelectSeries();
	                BP.SelectAccount();
	                BP.EnterVoucherAmount(VoucherAmount);
	                BP.EnterNaration(Naration);
	                BP.SelctTXNCode();
	                BP.SelectPaymentMode();
	                BP.EnterChequeNo(ChequeNo);
	                
////	                BP.EnterChequeDate(null);
//	                BP.SelectDebitToAccount();
//	                BP.ClickOnSubmitButton();

	                
	    			
	    			
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	            
	        }
	    }

	    @AfterTest
	    public void tearDown() {
//	        driver.quit();
	    }
}
