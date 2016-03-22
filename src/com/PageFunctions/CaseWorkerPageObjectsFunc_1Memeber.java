package com.PageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageObjects.CaseWorkerPageObjects;



public class CaseWorkerPageObjectsFunc_1Memeber extends com.selenium.SafeActions implements CaseWorkerPageObjects {
	
	public WebDriver driver;
	
	public CaseWorkerPageObjectsFunc_1Memeber(WebDriver d) {
		super(d);
		this.driver=d;
	
	}


	
	public void AddressChange() throws InterruptedException{
		
		safeClearAndType(username, "naresh.ullagaddi", 30);
		
		safeClearAndType(password, "Uchinn@90", 30);
		
		safeMouseClick(lbutton, 60);
		
		safeClearAndType(secqsn, "test", 30);
				
		safeMouseClick(contbtn, 60);
		
		selectFrame(frame, 30);
				
//		WebElement ele=new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(casesearch));
//		
//		ele.click();
		
		safeMouseClick(appsearch, 60);
			
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame1, 30);
		
		safeClearAndType(refno1, "232456", 30);
				
		safeMouseClick(searchbtn, 60);
		
		safeMouseClick(AppID, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(framex, 30);
						
		safeClick(AppID1, 60);
		
	    defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(framey, 30);
		
		safeMouseClick(caseid, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		waitUntilPresent(evidence, 30);
				
		safeMouseClick(evidence, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame2, 30);
		
		safeMouseClick(address, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame3, 30);
		
		safeClick(expand, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame4, 30);
		
		selectFrame(frame5, 30);
	
		safeMouseClick(editbtn, 30);
		
		safeMouseClick(editbtn1, 30);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame6, 30);
		
		safeClearAndType(addrs, "609 H St NE", 30);
		
		safeClearAndType(city, "Washington", 30);
		
		safeClearAndType(zip, "20002", 30);
		
		safeMouseClick(save, 30);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		safeMouseClick(home, 30);
		
//		selectFrame(frame, 30);
//		
//		safeMouseClick(appsearch, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(framex, 30);
		
		safeClick(AppID1, 60);
		
	    defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(framey, 30);
		
		safeMouseClick(caseid, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		waitUntilPresent(evidence, 30);
				
		safeMouseClick(evidence, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame2, 30);
		
		safeMouseClick(address, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
//		selectFrame(frame7, 30);
//		
//		safeMouseClick(evidenceedit, 60);
//		
//		defaultFrame();
//		waitForPageToLoad(60);
//		
//		selectFrame(frame8, 30);
//		
//		safeMouseClick(toggle, 60);
//		
//		safeMouseClick(applychanges, 60);
//		
//		defaultFrame();
//		waitForPageToLoad(60);
//		
//		selectFrame(frame9, 30);
//		
//		safeMouseClick(checkbox, 60);
//		
//		safeMouseClick(save, 30);
		
		}
	
public void ClearVerifications() throws InterruptedException{
		
	safeClearAndType(username, "naresh.ullagaddi", 30);
	
	safeClearAndType(password, "Uchinn@90", 30);
	
	safeMouseClick(lbutton, 60);
	
	safeClearAndType(secqsn, "test", 30);
			
	safeMouseClick(contbtn, 60);
	
	selectFrame(frame, 30);
	
	safeMouseClick(appsearch, 60);
		
	defaultFrame();
	waitForPageToLoad(60);
	
	selectFrame(frame1, 30);
	
	safeClearAndType(refno1, "232456", 30);
			
	safeMouseClick(searchbtn, 60);
	
	safeMouseClick(AppID, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame7, 30);
		
		safeMouseClick(verify, 60);
	
	
}

public void IncomeChange() throws InterruptedException{
	
	safeClearAndType(username, "naresh.ullagaddi", 30);
	
	safeClearAndType(password, "Uchinn@90", 30);
	
	safeMouseClick(lbutton, 60);
	
	safeClearAndType(secqsn, "test", 30);
			
	safeMouseClick(contbtn, 60);
	
	selectFrame(frame, 30);
	
	safeMouseClick(appsearch, 60);
		
	defaultFrame();
	waitForPageToLoad(60);
	
	selectFrame(frame1, 30);
	
	safeClearAndType(refno1, "232456", 30);
			
	safeMouseClick(searchbtn, 60);
	
	safeMouseClick(AppID, 60);
	
	defaultFrame();
	waitForPageToLoad(60);
	
	waitUntilPresent(evidence, 30);
			
	safeMouseClick(evidence, 60);
	
	defaultFrame();
	waitForPageToLoad(60);
	
	selectFrame(frame2, 30);
	
	safeMouseClick(recordincome, 60);
	
	safeMouseClick(income, 60);
	
	defaultFrame();
	waitForPageToLoad(60);
	
	safeMouseClick(toggle1, 60);
	
	safeMouseClick(newincome, 60);
	
	defaultFrame();
	waitForPageToLoad(60);
	
	selectFrame(frame10, 30);
	
    safeClearAndType(incometype, "Wages and Salaries", 30);
	
	safeClearAndType(source, "Manual", 30);
	
	safeClearAndType(taxform, "W2 Tax Form", 30);
		
	safeClearAndType(frequency, "Yearly", 30);
	
	safeClearAndType(amount, "80000", 30);
	
	safeClearAndType(stdate, "1/1/2012", 30);
	
	safeClearAndType(empname, "deepak", 30);
	
	safeClearAndType(street, "8125 48th ave", 30);
	
	safeClearAndType(city1, "college park", 30);
	
	safeClearAndType(state, "MD", 30);
	
	safeClearAndType(zip1, "48859", 30);
	
	safeMouseClick(save, 30);
	

}

public void IncomingEvidence() throws InterruptedException{
	
	safeClearAndType(username, "naresh.ullagaddi", 30);
	
	safeClearAndType(password, "Uchinn@90", 30);
	
	safeMouseClick(lbutton, 60);
	
	safeClearAndType(secqsn, "test", 30);
			
	safeMouseClick(contbtn, 60);
	
	selectFrame(frame, 30);

	safeMouseClick(appsearch, 60);
		
	defaultFrame();
	waitForPageToLoad(60);
	
	selectFrame(frame1, 30);
	
	safeClearAndType(refno1, "232456", 30);
			
	safeMouseClick(searchbtn, 60);
	
	safeMouseClick(AppID, 60);
	
	defaultFrame();
	waitForPageToLoad(60);
	
	selectFrame(frame7, 30);
	
	safeMouseClick(evidenceedit, 60);


}
}
	
