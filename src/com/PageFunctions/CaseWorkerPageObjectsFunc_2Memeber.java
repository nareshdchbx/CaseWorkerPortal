package com.PageFunctions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.CaseWorkerPageObjects;



public class CaseWorkerPageObjectsFunc_2Memeber extends com.selenium.SafeActions implements CaseWorkerPageObjects {
	
	public WebDriver driver;
	
	public CaseWorkerPageObjectsFunc_2Memeber(WebDriver d) {
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

		safeMouseClick(casesearch, 60);
			
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame1, 30);
		
		safeClearAndType(refno, "232456", 30);
				
		safeMouseClick(searchbtn, 60);
		
		safeMouseClick(AppID, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		waitUntilPresent(evidence, 30);
				
		safeMouseClick(evidence, 60);
		
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
		
		selectFrame(frame, 30);
		
		safeMouseClick(casesearch, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame1, 30);
		
		safeMouseClick(AppID, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame7, 30);
		
		safeMouseClick(evidenceedit, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame8, 30);
		
		safeMouseClick(toggle, 60);
		
		safeMouseClick(applychanges, 60);
		
		defaultFrame();
		waitForPageToLoad(60);
		
		selectFrame(frame9, 30);
		
		safeMouseClick(checkbox, 60);
		
		safeMouseClick(save, 30);
		
		}

}

