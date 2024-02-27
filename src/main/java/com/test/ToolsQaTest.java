package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToolsQaTest {
	@Test
public void toolsqa()
{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe ");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("apple");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("fruit");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("apple.fruit@gmail.com");
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("5678432109");
	WebElement country = driver.findElementByXPath("//select[@name='country']");
	Select s=new Select(country);
	s.selectByVisibleText("Afghanistan");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("single");
	
	
}
}
