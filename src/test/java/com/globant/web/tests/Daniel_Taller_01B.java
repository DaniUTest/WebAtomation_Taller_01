package com.globant.web.tests;
 
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Daniel_Taller_01B {
    
	public Logger log = Logger.getLogger(Daniel_Taller_01B.class);
	
	@BeforeSuite
    public void doBeforeSuite() {
		log.info ("Before suite");
    }       
     
    @BeforeTest
    public void doBeforeTest() {
    	log.info ("Before test");
    }
     
    @Test (priority = 2)
    public void AccountCreation() {
    	log.info ("Test Creation");
    }
    
    @Test (priority = 3)
    public void AccountLogout() {
    	log.info ("Test Logout");
    }
     
    @BeforeMethod
    public void doBeforeMethod() {
    	log.info ("Before method");
    }
     
    @AfterMethod
    public void doAfterMethod() {
    	log.info ("After method");
    }
     
    @BeforeClass
    public void doBeforeClass() {
    	log.info ("Before class");
    }
     
    @AfterClass
    public void doAfterClass() {
    	log.info ("After class");
    }
}