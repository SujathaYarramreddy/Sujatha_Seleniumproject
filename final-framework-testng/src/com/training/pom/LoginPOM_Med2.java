package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPOM_Med2 {
	private WebDriver driver; 
	
	public LoginPOM_Med2(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
		
	@FindBy(xpath="//table/tbody/tr[1]/td[1]/input")
	private WebElement productcheck;
	
	@FindBy(xpath="//i[contains(@class,'fa-trash-o')]")
	private WebElement delete1;
	
	
	
	
	public void clickOnCheck() throws InterruptedException {
		if(!(productcheck.isSelected())) {
			Thread.sleep(3000);
			productcheck.click();
		}
		
	}
	public void clickDelete1() {
		delete1.click();
		Alert alt = driver.switchTo().alert();
	    alt.accept();
		 
	}
	
	
}
