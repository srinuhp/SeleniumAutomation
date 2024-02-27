package com.ng1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WalmartTest {
	@Test
public void walmart()
{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.walmart.com/account/login?vid=oaoh&tid=0&returnUrl=%2F");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@name='Email Address']")).sendKeys("fine@gmail.com");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
