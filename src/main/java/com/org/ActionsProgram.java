package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement fac = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement bce = driver.findElement(By.xpath("//input[@id='pass']"));
		Actions a=new Actions(driver);
		a.moveToElement(fac).sendKeys("fhma@gmail.com").build().perform();
		a.sendKeys(bce, "krishna").build().perform();
		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		a.moveToElement(log).click().build().perform();
		//a.moveToElement(bce).sendKeys("krishna").build().perform();
		//Actions b=new Actions(driver);
		//b.moveToElement(bce).sendKeys("hsma").build().perform();
		
		
	}

}
