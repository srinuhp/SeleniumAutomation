package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationAlert {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display an  alert box:')]]")).click();
		Alert at = driver.switchTo().alert();
		at.accept();
		driver.findElement(By.xpath("//a[text()[contains(.,'Alert with OK & Cancel')]]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display a confirm box')]]")).click();
		at.accept();
		driver.findElement(By.xpath("//a[text()[contains(.,'Alert with Textbox')]]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[text()[contains(.,'click the button to demonstrate the prompt box')]]")).click();
		at.sendKeys("Rama");
		at.accept();
	}

}
