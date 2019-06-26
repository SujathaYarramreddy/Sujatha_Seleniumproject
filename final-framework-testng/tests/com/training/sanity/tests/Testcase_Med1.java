package com.training.sanity.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM1;
import com.training.pom.LoginPOM2;
import com.training.pom.LoginPOM3;
import com.training.pom.LoginPOM_Med1;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Testcase_Med1 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM1 loginPOM1;
	private LoginPOM_Med1 loginPOM_Med1;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM1 = new LoginPOM1(driver);
		loginPOM_Med1 = new LoginPOM_Med1(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	/*@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}*/
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException, AWTException {
		loginPOM1.sendUserName("admin");
		loginPOM1.sendPassword("admin@123");
		loginPOM1.clickLoginBtn(); 
		screenShot.captureScreenShot("First_Med");
		loginPOM_Med1.clickCatalog1();
		screenShot.captureScreenShot("Second_Med");
		loginPOM_Med1.clickProducts();
		screenShot.captureScreenShot("Third_Med");
		loginPOM_Med1.clickOnEdit();
		screenShot.captureScreenShot("Fourth_Med");
		loginPOM_Med1.clickData();
		screenShot.captureScreenShot("Fifth_Med");
		loginPOM_Med1.enterQuantity("10");
		screenShot.captureScreenShot("Sixth_Med");
		loginPOM_Med1.clickSave();
		screenShot.captureScreenShot("Seventh_Med");
	}
	
}


