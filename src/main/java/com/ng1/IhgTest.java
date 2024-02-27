package com.ng1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IhgTest {
	@Test
public void ihg()
{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("abca");
	driver.findElementByXPath("//*[@id='lastName']").sendKeys("111");
	driver.findElementByXPath("//*[@id='email']").sendKeys("fine111@gmail.com");
	driver.findElementByXPath("//*[@id='confirmEmail']").sendKeys("fine111@gmail.com");
	driver.findElementByXPath("//*[@id='password']").sendKeys("welcome123");
	driver.findElementByXPath("//*[@id='confirmPassword']").sendKeys("welcome123");
	driver.findElementByXPath("//*[@id='address1']").sendKeys("9 clausen ct");
	driver.findElementByXPath("//*[@id='address2']").sendKeys("9 clausen ct");
	driver.findElementByXPath("//*[@id='city']").sendKeys("Budd lake");
	driver.findElementByXPath("//*[@id='state']").sendKeys("NJ");
	driver.findElementByXPath("//*[@id='zipCode']").sendKeys("07057");
}
}
