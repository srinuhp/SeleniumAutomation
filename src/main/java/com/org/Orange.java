package com.org;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {
	public static String parent,linkedIn,facebook,twitter,youtube;
	public static Set<String> all;
	public static Iterator<String> it;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		 parent = driver.getWindowHandle();
		 System.out.println("HRM LoginPage UniqueID: "+parent);
		 Thread.sleep(6000);
		 WebElement link = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		 link.click();
		 System.out.println(driver.getTitle());
		 all = driver.getWindowHandles();
		 System.out.println("Total windows Opened: "+all.size());
		 it = all.iterator();
		 while(it.hasNext())
		 {
			  linkedIn = it.next();
			  if(!parent.equals(linkedIn))
			  {
				  driver.switchTo().window(linkedIn);
			  }
		 }
		 System.out.println(driver.getTitle());
		 WebElement sign = driver.findElement(By.xpath("//button[text()[contains(.,'Sign in')]]"));
		 sign.click();
		 Thread.sleep(4000);
		 WebElement username = driver.findElement(By.xpath("//input[@name='session_key']"));
		 username.sendKeys("Danda");
		 driver.switchTo().window(parent);
		 System.out.println(driver.getTitle());
		 WebElement fb = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
		 fb.click();
		 all = driver.getWindowHandles();
		 System.out.println("Total windows Opened: "+all.size());
		  it = all.iterator();
		 while(it.hasNext())
		 {
			 facebook = it.next();
			  if(!parent.equals(facebook))
			  {
				  driver.switchTo().window(facebook);
			  }
		 }
		 System.out.println(driver.getTitle());
		 Thread.sleep(6000);
		 WebElement close = driver.findElement(By.xpath("(//div[@role='button'])[10]"));
		 close.click();
		 Thread.sleep(6000);
		 WebElement phone = driver.findElement(By.xpath("//input[@name='email']"));
		 phone.sendKeys("000665544");
			
		
	}

}
