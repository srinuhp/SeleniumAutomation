package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest1 {
	@Test(invocationCount=2,invocationTimeOut=300000000)
public void fb()
{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("orange");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("orange@3456");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
