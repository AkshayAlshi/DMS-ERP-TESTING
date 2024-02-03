package com.TestForConFigureMaster;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ConfigureMasterPom.PartyMasterPom;

import TestBase.Base;
import TestBase.TBase;
import Utilitys.XLUtils1;

public class PartyMasterTest extends Base {
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dtestdata.xlsx";
	    String sheetName ="PartyMasterTest";
	    int rowCount;
	    int colCount;

	    public PartyMasterTest() throws IOException {
	        super();
	        
	    }
	
	
	@BeforeTest
	public void setup () throws Exception {
		
		initialization();
//	 ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TEST\\DinshawsTesting\\PatryMaster.Properties"); 

		Thread.sleep(2000);
		selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-PartyMasterTest"), prop.getProperty("SubModuleXapath-PartyMasterTest"), prop.getProperty("FormNameXpath-PartyMasterTest"));
		Thread.sleep(2000);
		
	}
	
	@Test
	public void VerifyPartyMasterTestForm() throws Exception {
		
		try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 10; rowNum++) {
                int colNum = 0;

				String Name = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
				String Alias = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 1);
				String PartyCode = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 2);
				String GSTNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 3);
//				String PANno = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 4);
				String CreditDays = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 4);
				String TreadName = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 5);
				String ContactPersonDetail = reader.getCellData(sheetPath, sheetName, rowNum, colNum+6);
				String contactno1 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 7);
				String FSSAINo = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 8);
				String EffectiveDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 9);
				String UpToDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 10);
				String BankName = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 11);
				String BranchName = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 12);
				String AccountNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum+13);
				String IFSCCode = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 14);
				String nulSwiftCodel = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 15);
				String UPIid = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 16);
				String EnterName1 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 17);
				String EnterAddress = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 18);
				String City = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 19);
				String EnterPIN = reader.getCellData(sheetPath, sheetName, rowNum, colNum+20);
				String EnterphoneNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 21);
               
		PartyMasterPom PM=new PartyMasterPom(driver);
		PM.ClickOnAddButton();
		PM.SelectPartyTpe();
		PM.EnterName(Name);
		PM.EnterAlias(Alias);
		PM.EnterPartyCode(PartyCode);
		PM.SelectAccoountGroup();
		PM.SelectCompanyType();
		PM.SelectGSTtype();
		PM.EnterGSTNo(GSTNo);
//		PM.EnterPANno(PANno);
		PM.EnterCreditDays(CreditDays);
//		PM.ClickOutstandingDueCheck();
		PM.CreateTreadName(TreadName);
		PM.EnterContactPersonDetail(ContactPersonDetail);
		PM.Entercontactno1(contactno1);
		PM.EnterFSSAINo(FSSAINo);
		PM.EnterEffectiveDate(EffectiveDate);
		PM.EnterUpToDate(UpToDate);
		PM.ClickOnBankDeatilsTab();
		PM.EnterBankName(BankName);
		PM.EnterBranchName(BranchName);
		PM.EnterAccountNo(AccountNo);
		PM.EnterIFSCCode(IFSCCode);
		PM.EnterSwiftCode(nulSwiftCodel);
		PM.EnterUPIid(UPIid);
		PM.ClickOnAddressTab();
		PM.EnterName1(EnterName1);
		PM.EnterAddress(EnterAddress);
		PM.EnterCity(City);
		PM.EnterPIN(EnterPIN);
		PM.EnterphoneNo(EnterphoneNo);
		PM.SameAsPermanentAddressChecks1();
		PM.SameAsPermanentAddressChecks2();
		PM.SameAsPermanentAddressChecks3();
		PM.ClickOnSubmitButton();
		initialization();
		Thread.sleep(2000);
		selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-PartyMasterTest"), prop.getProperty("SubModuleXapath-PartyMasterTest"), prop.getProperty("FormNameXpath-PartyMasterTest"));
		Thread.sleep(2000);
            
        Thread.sleep(1000);
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }

	
	@AfterTest
	public void TearDown() {
//		driver.quit();
	}
	
	
	
	


}
