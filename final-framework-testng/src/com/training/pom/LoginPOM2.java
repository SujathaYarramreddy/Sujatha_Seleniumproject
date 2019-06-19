package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPOM2 {
	private WebDriver driver; 
	
	public LoginPOM2(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//*[contains(@class,'btn')]")
	private WebElement loginBtn; */
	
	@FindBy(id="catalog")
	private WebElement catalog;
	
	@FindBy(linkText="Categories")
	private WebElement category;
	
	/*public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click();
	}*/
	public void clickCatalog() {
		this.catalog.click();
		System.out.println(catalog.getText());
		
	}
	public void clickCategory() {
		this.category.click();
		System.out.println(category.getText());
		String Expectedtitle = "Categories";
		String Actualtitle = driver.getTitle();
		Assert.assertEquals(Actualtitle, Expectedtitle);
		
		
	}
}
