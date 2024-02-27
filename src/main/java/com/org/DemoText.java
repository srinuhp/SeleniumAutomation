package com.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.switchTo().frame("singleframe");
		//WebElement border = driver.findElementByXPath("//iframe[@id='singleframe']");
		//driver.switchTo().frame(border);
		driver.findElementByXPath("//input[@id='userName']").sendKeys("abc");
		driver.findElementByXPath("//input[@id='userEmail']").sendKeys("abc.gf@gmail.com");
		driver.findElementByXPath("//textarea[@id='currentAddress']").sendKeys("8 bender st");
		driver.findElementByXPath("//textarea[@id='permanentAddress']").sendKeys("23 froce dr");
		driver.findElementByXPath("//button[@id='submit']").click();

	}

}
