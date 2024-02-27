package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaExecutor8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		//System.out.println(driver.getTitle());
		String URL=js.executeScript("return document.URL;").toString();
	System.out.println(URL);
		//System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('first-name').value='3';");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
				js.executeScript("arguments[0].click();",email);
		driver.findElementByXPath("//input[@name='lastName']").sendKeys("dfg");
		driver.findElementByXPath("//input[@id='email']").sendKeys("adcd.dfg@gmail.com");
		driver.findElementByXPath("//input[@id='mobile']").sendKeys("78654321");
		WebElement country = driver.findElementByXPath("//select[@name='country']");
		Select s=new Select(country);
	}

}
