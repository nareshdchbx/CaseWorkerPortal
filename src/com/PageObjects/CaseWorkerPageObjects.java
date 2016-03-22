package com.PageObjects;

import org.openqa.selenium.By;

public interface CaseWorkerPageObjects {
	
	public static By username=By.id("userid");
	
	public static By password=By.id("pass");
	
	public static By lbutton=By.xpath("//*[@value='Login']");
	
	public static By secqsn=By.id("Bharosa_Challenge_PadDataField");
	
	public static By contbtn=By.xpath("//*[@title='Continue']");  
	
	public static By frame=By.xpath("//*[contains(@title,'Content Panel - Home')]");
	
	public static By casesearch = By.xpath("(//a[contains(@class,'ac')])[9]");
	
	public static By appsearch = By.linkText("Search for an Application...");
	
	public static By frame1=By.xpath("//*[contains(@title,'Content Panel - Case Worker Home')]");
	
	public static By refno = By.id("__o3id0");
	
	public static By refno1 = By.id("__o3id1");
	
	public static By searchbtn = By.linkText("Search");
	
	public static By AppID = By.xpath("(//a[contains(@class,'field-link')])[1]");  
	
	public static By framex=By.xpath("//*[@page-id='CommonIntake_applicationCaseHomeContextPanel']");
	
    public static By AppID1 = By.xpath("//*[@class='name-one-title']/a");
    
    public static By framey=By.xpath("(//iframe[contains(@title,'Content Panel - Home')])[3]");
    
    public static By caseid = By.xpath("//table[@id='sortable_N21BD3']/tbody/tr[2]/td[1]/a");
	
	public static By evidence = By.xpath("(//*[@title='Evidence'])[6]");
	
	public static By frame2=By.xpath("//*[contains(@title,'Content Panel - Evidence Dashboard')]");
	
	public static By address = By.linkText("Address");
	
	public static By frame3=By.xpath("(//*[contains(@title,'Content Panel - Evidence')])[2]");
	
	public static By expand = By.cssSelector(".first-field.list-details-row-toggle-cell");
	
	public static By frame4=By.xpath("(//iframe[contains(@title,'Content Panel - Evidence')])[2]");
	
	public static By frame5=By.xpath("//iframe[not(contains(@src,'en_US'))]");
	
	public static By editbtn = By.xpath("//*[contains(@title,'Click to display list actions menu')]");
	
	public static By editbtn1=By.xpath("//td[@id='dijit_MenuItem_0_text' and not(contains(text(),'About'))]");
	
	public static By frame6=By.xpath("//*[contains(@title,'Modal Frame - Edit Address')]");
	
	public static By addrs = By.id("__o3idc");
	
	public static By city = By.id("__o3idf");
	
	public static By zip = By.id("__o3id10");
	
	public static By save = By.xpath(".//*[@id='modal-actions-panel']/div/a[1]/span/span/span");
	
	public static By home = By.xpath(".//*[@id='app-sections-container-dc_tablist_DCHXCaseworkerHomeSection-stc_tabLabel']");
	
	public static By evidenceedit = By.xpath(".//*[@title='Open In Edit Evidence relating to this case']");
	
	public static By frame7=By.xpath(".//iframe[contains(@page-id,'DefaultIC_tabDetails')]");
	
	public static By toggle = By.id("page-level-action-menu");
	
	public static By frame8 = By.xpath(".//iframe[contains(@title,'Content Panel - In Edit Evidence')]");
	
	public static By applychanges = By.id("dijit_MenuItem_2_text");
	
	public static By frame9 = By.xpath(".//iframe[contains(@title,'Modal Frame - Apply Changes')]");
	
	public static By checkbox = By.xpath(".//input[contains(@title,'Select/Deselect all rows')]");
	
	public static By verify = By.xpath(".//a[contains(@title,'Open Verifications relating to this case')]");
	
	public static By recordincome = By.xpath(".//*[@id='All_Label_ContentPanel_1']/div/span");
	
	public static By income = By.xpath(".//*[@id='td_3_Table_ContentPanel_1']/a");
	
	public static By toggle1 = By.xpath("(//*[contains(@class,'dijitReset dijitInline dijitButtonText')])[3]");
	
	public static By newincome = By.cssSelector("#menuItem_dojox_layout_ContentPane_3_EvidenceNewEvidence_text");
	
	public static By frame10 = By.xpath(".//iframe[contains(@title,'Modal Frame - New Income')]");
	
	public static By incometype = By.id("__o3id6");
	
	public static By source = By.id("__o3id7");
	
	public static By taxform = By.id("__o3id8");
	
	public static By frequency = By.id("__o3id9");
	
	public static By amount = By.id("__o3ida");
	
	public static By stdate = By.id("__o3idb");
	
	public static By empname = By.id("__o3idf");
	
	public static By street = By.id("__o3id11");
	
	public static By city1 = By.id("__o3id13");
	
	public static By state = By.id("__o3id14");
	
	public static By zip1 = By.id("__o3id15");
	
	public static By prtcpntaddrs = By.linkText("Participant Address");
	
	
	
	
	
}
