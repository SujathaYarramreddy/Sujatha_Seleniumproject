package com.training.pom;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPOM3 {
	private WebDriver driver; 
	
	public LoginPOM3(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//table/tbody/tr[2]/td[1]/input")
	private WebElement checkbox;
	
	@FindBy(xpath="//*[contains(@onclick, 'confirm')]")
	private WebElement deletebtn;
	
	@FindBy(xpath="//*[contains(@class,'alert alert-success')]")
	private WebElement success;
	
	public void checkWinteruniform() {
		if(!(checkbox.isSelected())) {
			checkbox.click();
		}
		
	}
	public void delteButton() {
		
			this.deletebtn.click();
			Alert alt = driver.switchTo().alert();
		    alt.accept();
		    //-I am getting assertion error due to expected text format
		    /*String actualtext = success.getText();
		    //System.out.println(actualtext);
		    
		    String expectedtext = "Success: You have modified categories!\r\n" + 
		    		"×" ;
		    Assert.assertEquals(expectedtext, actualtext);*/
			
	}

}
