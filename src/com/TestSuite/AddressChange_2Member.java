package com.TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.PageFunctions.CaseWorkerPageObjectsFunc_2Memeber;
import com.base.BaseClass;

public class AddressChange_2Member {
	
public BaseClass b;
	
	WebDriver d;
	
	CaseWorkerPageObjectsFunc_2Memeber caseworkerpage;
	
@BeforeMethod
	
	public void bsateup()
	{

		b=new BaseClass();
		d=b.getdriver("chrome");
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		d.get("https://webpp.dchealthlink.com/Curam/");
		
		caseworkerpage = new CaseWorkerPageObjectsFunc_2Memeber(d);
		
		d.manage().window().maximize();
		
	}

      @Test

      public void sample() throws InterruptedException{
    	  
    	  caseworkerpage.AddressChange();
    	  
    	  Thread.sleep(3000);
  
      }
      
      @AfterMethod
	  public void afterMethod() {

		// d.close();
		   
	}
      }
