package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserstackTest {
	@Test(invocationCount=2)
public void bs()
{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.browserstack.com/users/sign_in?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=668820804431&utm_campaign=Search-Brand-US-AMER-Product&utm_campaigncode=Live+9003709&utm_term=p+live%20browserstack");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("user@gmail.com");
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("apple12345");
	driver.findElement(By.xpath("//input[@name='commit']")).click();
	
}
}
