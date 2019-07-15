package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
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

public class LoginPOM_Complex1 {
	private WebDriver driver; 
	
	public LoginPOM_Complex1(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
		
		//--Changing the Products status
		
		@FindBy(linkText="Reports")
		private WebElement report;
		
		public void clickOnEdit() {
			report.click();
		}
		
		@FindBy(id="button-customer")
		private WebElement btncustomer;
		
		public void clickOnBtnCus() {
			btncustomer.click();
		}
		
		@FindBy(xpath="//i[contains(@class,'fa fa-minus-circle')]")
		private WebElement removebtn;
		
		public void clickOnRemove() {
			removebtn.click();
		}
		
		@FindBy(id="input-product")
		private WebElement chooseproduct;
		
		public void chooseProduct() {
			Select sel = new Select(chooseproduct);
			sel.selectByIndex(1);
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
		
		@FindBy(id="button-save")
		private WebElement save;
		
		public void clickOnSave() {
			save.click();
		}
		
}


