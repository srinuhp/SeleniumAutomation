package com.all;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserstackTest {
	@Test(alwaysRun=true)
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_in?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=668820804431&utm_campaign=Search-Brand-US-AMER-Product&utm_campaigncode=Live+9003709&utm_term=p+live%20browserstack");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("lexia@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("lexia123456");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
			
	}

}
