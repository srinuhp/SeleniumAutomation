package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmTest {
	@Test
public void orangehrm() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("fine");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("fine345");
	
	
}
}
