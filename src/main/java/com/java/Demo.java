package com.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.switchTo().frame("singleframe");
		//WebElement border = driver.findElementByXPath("//iframe[@id='singleframe']");
		//driver.switchTo().frame(border);
		driver.findElementByXPath("//input[@id='yesRadio']/following::label").click();
		
	}

}
