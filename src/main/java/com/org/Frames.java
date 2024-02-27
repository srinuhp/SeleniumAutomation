package com.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	private static WebElement animals;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.switchTo().frame("animals");
		WebElement animals = driver.findElementByXPath("//iframe[@id='frame2']");
		driver.switchTo().frame(animals);
		WebElement small = driver.findElementByXPath("//select[@id='animals']");
		Select s=new Select(small);
		s.selectByVisibleText("Avatar");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame1");
		driver.findElementByXPath("//input[@type='text']").sendKeys("cdf");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame1").switchTo().frame("frame3");
		driver.findElementByXPath("//input[@id='a']").click();
		
		
		
	}	
	}

