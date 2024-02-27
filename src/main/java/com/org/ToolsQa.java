package com.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("abcd");
		driver.findElementByXPath("//input[@name='lastName']").sendKeys("dfg");
		driver.findElementByXPath("//input[@id='email']").sendKeys("adcd.dfg@gmail.com");
		driver.findElementByXPath("//input[@id='mobile']").sendKeys("78654321");
		WebElement country = driver.findElementByXPath("//select[@name='country']");
		Select s=new Select(country);
		//s.selectByIndex("118");
		//s.selectByValue("Albania");
		s.selectByVisibleText("Albania");
		driver.findElementByXPath("//input[@id='city']").sendKeys("budd");
	}

}
