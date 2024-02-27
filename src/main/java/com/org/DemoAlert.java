package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoAlert {
public static void main(String[] args)
	// TODO Auto-generated method stub
	{
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			//driver.findElementByXPath("//button[@id='alertButton']").click();
			//driver.switchTo().alert();
			//driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display an  alert box:')]]")).click();
			//Alert at = driver.switchTo().alert();
			//at.accept();
			//driver.findElementByXPath("//button[@id='timerAlertButton']").click();
			//driver.switchTo().alert();
			//driver.findElement(By.xpath("//button[text()[contains(.,'Alert with OK & Cancel')]]")).click();
			//Alert at = driver.switchTo().alert();
			//driver.findElementByXPath("//button[@id='confirmButton']").click();
			//driver.switchTo().alert();
			//driver.findElement(By.xpath("//button[text()[contains(.,'Alert with OK & Cancel')]]")).click();
			//Alert at = driver.switchTo().alert();
			//at.accept();
			driver.findElementByXPath("//button[@id='promtButton']").click();
			driver.switchTo().alert();
			driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display an  alert box:')]]")).click();
			Alert at = driver.switchTo().alert();
			at.accept();
			
			
}
}