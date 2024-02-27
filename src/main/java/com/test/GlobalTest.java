package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GlobalTest {
	@Test
public void global()
{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/samplepagetest/");
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@class='name']")).sendKeys("veda");
	driver.findElement(By.xpath("//input[@class='email']")).sendKeys("veda@gmail.com");
	driver.findElement(By.xpath("//input[@name='g2599-website']")).sendKeys("www.sampletest.com");
	Select drpCountry = new Select(driver.findElement(By.name("g2599-experienceinyears")));
	drpCountry.selectByVisibleText("0-1");
}
}
