package com.crm.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.base.Testbase;

public class registration extends Testbase {
	
	// Page Factory - object respository 
	@FindBy(xpath="//a[@class='login']")
	WebElement signin;
	
	@FindBy(id ="email_create")
	WebElement email;
	
	@FindBy(id ="SubmitCreate")
	WebElement create;
	
	//Objects for Create Account 
	@FindBy(id="id_gender1")
	WebElement title;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement first_name;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement last_name;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement selectday ;
	
	@FindBy(xpath="//option[@value='1']")
	WebElement selectdate;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement selectmonth;
	
	@FindBy(xpath="//option[@value='2']")
	WebElement selmonthvalue;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement selectyear;
	
	@FindBy(xpath="//option[@value='1990']")
	WebElement selectyearvalue;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement addfirstname ;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement addlasttname ;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement company ;
	
	@FindBy(xpath="//input[@id='address2']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']")
	WebElement state;
	
	@FindBy(xpath="//option[contains(text(),'Texas')]")
	WebElement selectstate; 
	
	@FindBy(xpath="//input[@id='postcode']")
	WebElement zipcode;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement mobilephone;
	
	@FindBy(xpath="//input[@id='alias']")
	WebElement addalias;
	
	@FindBy(xpath="//button[@id='submitAccount']")
	WebElement submit;
	

	
	// To initialize the page factory objects , this reference to current variables			
	public registration() {
		PageFactory.initElements(driver, this);
	}
	
	public void sigin() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		signin.click();
		
	}
	
	public void enteremail() {
		email.sendKeys("vasanth.kumar@gmail.com");		
	}
	
	public void create() {		
		create.click();
	}
	
	
	public void createanaccount() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		title.click();
		first_name.sendKeys("test");
		last_name.sendKeys("auto");
		password.sendKeys("Test123#");
		selectday.click();
		selectdate.click();
		selectmonth.click();
		selmonthvalue.click();
		selectyear.click();
		selectyearvalue.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		addfirstname.sendKeys("test");
		addlasttname.sendKeys("auto1");
		address.sendKeys("5404 PawneeTrail Losuivllee");	
		city.sendKeys("mysore");
		state.click();
		selectstate.click();
		zipcode.sendKeys("570009");
		//phone.sendKeys("1234567890");
		mobilephone.sendKeys("4694123561");
		addalias.clear();
		addalias.sendKeys("housename");
		submit.click();
				
	}
	
	
	
	
		

}
