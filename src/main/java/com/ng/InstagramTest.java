package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InstagramTest {
	@Test(groups= {"smoke"})
	public void instagram() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("lexia");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("lexia15");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
