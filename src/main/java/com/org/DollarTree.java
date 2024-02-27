package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DollarTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.dollartree.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath("//iput[@alt='Account']").click();
		driver.findElementByXPath("//input[@name='signInEmailAddress']").sendKeys("welcome");
		driver.findElementByXPath("//input[@name='currentPassword']").sendKeys("fine");
		driver.findElementByXPath("//input[@id='sign_in_sumbit_btn']").click();
		

	}

}
