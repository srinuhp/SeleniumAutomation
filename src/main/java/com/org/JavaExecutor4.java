package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('email').value='3';");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		js.executeScript("arguments[0].value='3';",email);
		driver.findElement(By.name("pass")).sendKeys("Srini");
		//driver.findElement(By.name("login")).click();
				//driver.findElementByXPath("//a[text()='Forgot password?']");
				driver.findElementByXPath("//a[text()[contains(.,'Forgot')]]");
				//driver.findElement(By.linkText("Forgot password?")).click();
				driver.findElement(By.partialLinkText("Forgot")).click();
	}

}
