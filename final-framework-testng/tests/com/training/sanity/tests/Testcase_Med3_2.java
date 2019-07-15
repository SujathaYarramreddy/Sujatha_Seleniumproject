package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.LinearGradientPaint;
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
import com.training.pom.LoginPOM_Med2;
import com.training.pom.LoginPOM_Med3;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Testcase_Med3_2 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM1 loginPOM1;
	private LoginPOM_Med1 loginPOM_Med1;
	private LoginPOM_Med3 loginPOM_Med3;
	private static Properties properties;
	private ScreenShot screenShot;
	private String adminURL;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM1 = new LoginPOM1(driver);
		loginPOM_Med1 = new LoginPOM_Med1(driver); 
		loginPOM_Med3 = new LoginPOM_Med3(driver);
		baseUrl = properties.getProperty("baseURL");
		adminURL= properties.getProperty("adminURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(adminURL);

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
		public void validLoginAdmin() throws InterruptedException, AWTException {
		
		loginPOM1.sendUserName("admin");
		loginPOM1.sendPassword("admin@123");
		loginPOM1.clickLoginBtn();
		screenShot.captureScreenShot("second_Med3");
		loginPOM_Med3.clickOnCart();
		screenShot.captureScreenShot("Third_Med3");
		loginPOM_Med3.clickOnOrders();
		screenShot.captureScreenShot("Fourth_Med3");
		loginPOM_Med3.clickOnView();
		screenShot.captureScreenShot("Fifth_Med3");
		loginPOM_Med3.clickOnGenerate();
		screenShot.captureScreenShot("sixth_Med3");
	}
	
}



