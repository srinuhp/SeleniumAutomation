package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement button2 = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions a=new Actions(driver);
		//a.moveToElement(button2).doubleClick().build().perform();
		a.doubleClick(button2).build().perform();
		driver.switchTo().alert().accept();
		WebElement button1 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		a.moveToElement(button1).contextClick().build().perform();
		
		
	}

}
