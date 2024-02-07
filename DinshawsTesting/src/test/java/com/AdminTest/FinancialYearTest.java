package com.AdminTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.PomForAdmin.FinancialYearPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class FinancialYearTest  extends TBase{

	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Admin Modul Test DATA.xlsx";
    String sheetName ="FinancialYearTest";
    int rowCount;
    int colCount;

    public FinancialYearTest() throws IOException {
        super();
          
    }


@BeforeTest
public void setup () throws Exception {
	ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Admin.Properties");
	initialization();
	Thread.sleep(2000);
	selectModuleNameForAdmin(prop.getProperty("ModlueXpath-FinancialYearTest"), prop.getProperty("SubModuleXapath-FinancialYearTest") );
	Thread.sleep(2000);
	
	
}


@Test
public void VerifyFinancialYearForm() throws Exception {
	
	try {
		
 rowCount = reader.getRowCount(sheetPath,sheetName);
 colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

 for (int rowNum = 1; rowNum <= 1; rowNum++) {
     int colNum = 0;
     
     

			String year = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
			String displayname = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
			String StartDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);
			
    
			FinancialYearPom DP=new FinancialYearPom(driver);
			
			DP.AddButton();
			DP.EnterYearCo(year);
			DP.EnterDisplay(displayname);
			DP.EnterStartDate(StartDate);
//			DP.EnterEndDate(EndDate);
			DP.IscurrentCheck();
			DP.ClickOnMarchCheckBox();
			DP.ClickOnSubmitButton();


			
			
			
			
	
 
Thread.sleep(1000);
 }
} catch (IOException e) {
 e.printStackTrace();
 
}
}


@AfterTest
public void TearDown() {
//	driver.quit();
}
}
