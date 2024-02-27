package com.ng2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToolsqaTest {
	@Test
public void tools()
{
System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
String exp="https://toolsqa.com/selenium-training?q=banner#enrol";
String act=driver.getCurrentUrl();
SoftAssert sa=new SoftAssert();
sa.assertTrue(exp.equals(act));
driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("abcd");
driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("cdfg123");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("456789321");
WebElement country =driver.findElement(By.xpath("//select[@name='country']"));
Select s=new Select(country);
s.selectByVisibleText("Albania");
driver.findElement(By.xpath("//input[@id='city']")).sendKeys("single");

}
}
