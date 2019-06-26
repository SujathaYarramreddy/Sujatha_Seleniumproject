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

public class LoginPOM_Med1 {
	private WebDriver driver; 
	
	public LoginPOM_Med1(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="catalog")
	private WebElement catalog;
	
	@FindBy(linkText="Products")
	private WebElement product;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[8]/a/i")
	private WebElement productedit;
	
	@FindBy(xpath="//*[@href='#tab-data']")
	private WebElement data;
	
	@FindBy(id="input-quantity")
	private WebElement quantity;
	
	@FindBy(xpath="//i[contains(@class,'fa-save')]")
	private WebElement save;
	
	
	public void clickCatalog1() {
		catalog.click();	
	}
	public void clickProducts() {
		product.click();
	}
	public void clickOnEdit() {
		productedit.click();
		
	}
	public void clickData() {
		data.click();
	}
	public void enterQuantity(String quantity) throws AWTException {
		this.quantity.clear();
		this.quantity.sendKeys(quantity);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
			
	}
	public void clickSave() {
		save.click();
	}

}
