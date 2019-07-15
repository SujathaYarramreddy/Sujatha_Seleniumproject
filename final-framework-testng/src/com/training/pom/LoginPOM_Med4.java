package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPOM_Med4 {
	private WebDriver driver; 
	
	public LoginPOM_Med4(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
		
		//--Editing the order
	
	
	@FindBy(xpath="//*[contains(@class,'shopping-cart fa-fw')]")
	private WebElement cart1;
	
	public void clickOnCart() {
		cart1.click();
	}
	
	@FindBy(linkText="Orders")
	private WebElement order;
	
	public void clickOnOrders() throws InterruptedException {
		
		order.click();
	}
	
		
		@FindBy(xpath="//i[contains(@class,'fa-pencil')]")
		private WebElement editicon;
		
		public void clickOnEdit() throws InterruptedException {
			Thread.sleep(2000);
			editicon.click();
		}
		
		@FindBy(id="button-customer")
		private WebElement btncustomer;
		
		public void clickOnBtnCus() {
			btncustomer.click();
		}
		
		@FindBy(xpath="//i[contains(@class,'fa fa-minus-circle')]")
		private WebElement removebtn;
		
		public void clickOnRemove() throws InterruptedException {
			Thread.sleep(2000);
			removebtn.click();
		}
		
		@FindBy(id="input-product")
		private WebElement chooseproduct;
		
		public void chooseProduct(String chooseproduct) {
			this.chooseproduct.clear();
			this.chooseproduct.sendKeys(chooseproduct);
		}
		@FindBy(id="input-quantity")
		private WebElement choosequantity;
		
		public void chooseQuantity(String choosequantity) {
			this.choosequantity.clear();
			this.choosequantity.sendKeys(choosequantity);
			
		}
		
		@FindBy(id="button-product-add")
		private WebElement productadd;
		
		public void clickOnProductadd() {
			productadd.click();
		}
		
		@FindBy(id="button-cart")
		private WebElement producbtn;
		
		public void clickOnProductbtn() {
			producbtn.click();
		}
		
		@FindBy(id="button-payment-address")
		private WebElement producaddr;
		
		public void clickOnProductAddress() {
			producaddr.click();
		}
		@FindBy(id="button-shipping-address")
		private WebElement shipaddr;
		
		public void clickOnShipaddr() {
			shipaddr.click();
		}
		
		@FindBy(xpath="//button[@id='button-save']/i")
		private WebElement save1;
		
		public void clickOnSave() throws AWTException, InterruptedException{
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			save1.click();
		}
		
}


