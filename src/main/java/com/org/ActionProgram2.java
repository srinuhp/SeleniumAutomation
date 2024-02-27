package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement fac = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement bce = driver.findElement(By.xpath("//input[@name='password']"));
		Actions a=new Actions(driver);
		//a.moveToElement(fac).sendKeys("ghma").build().perform();
		a.sendKeys(fac, "ghma").build().perform();
		
	}

}
