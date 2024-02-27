package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logInModal")).click();
		driver.findElement(By.id("loginusername")).sendKeys("Sushma");
		driver.findElement(By.id("loginpassword")).sendKeys("Srini");
		driver.findElement(By.name("login")).click();

	}

}
