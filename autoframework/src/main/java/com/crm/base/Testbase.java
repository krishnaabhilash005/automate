package com.crm.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	
	public static WebDriver driver ;
	
	public Testbase() {
		
		
	}
	
	public static void initialization() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_99\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(3000);
        
        
		
		
	}

}
