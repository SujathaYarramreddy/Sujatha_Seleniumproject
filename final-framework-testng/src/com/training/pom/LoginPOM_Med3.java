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

public class LoginPOM_Med3 {
	private WebDriver driver; 
	
	public LoginPOM_Med3(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//i[contains(@class,'fa fa-home fa-lg')]")
	private WebElement home;
	
	public void clickHome() {
		home.click();	
	}
	@FindBy(linkText="Uniform Store")
	private WebElement store;
	
	public void clickStore() {
		store.click();
	}
	@FindBy(linkText="Sport Uniform")
	private WebElement uniform;
	
	public void clickSport() {
		uniform.click();
	}
	
	@FindBy(xpath="//a[contains(@href,'product_id=179')]")
	private WebElement product1;
	
	public void clickImage() {
		product1.click();
	}
	
	
}

