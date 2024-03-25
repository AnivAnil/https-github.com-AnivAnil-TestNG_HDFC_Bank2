package org.travels;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Travels extends BaseMethod {

	@BeforeMethod
	private void beforemethod() {
		browserlaunch("Chrome");
		implicitlyWait(20);
	}

	@BeforeClass
	private void beforeclass() {
		System.out.println("beforeclass" + new Date());
	}

	@AfterClass
	private void afterclass() {
		System.out.println("afterclass" + new Date());
	}

	@Test
	private void test1() throws InterruptedException {
		geturl("https://www.redbus.in/");
		LoginPage l = new LoginPage();
		sendkeys(l.getFrom(), "Chennai");
		sendkeys(l.getTo(), "Nellore");
		click(l.getFromto());
		click(l.getDate2());
		click(l.getDate());
		click(l.getSearchbtn());
		Thread.sleep(2000);
		click(l.getRedbus());
		Thread.sleep(2000);
		alert();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}