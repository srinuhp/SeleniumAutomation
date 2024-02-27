package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement baby = driver.findElement(By.xpath("//span[text()[contains(.,'Baby Wishlist')]]"));
		WebElement account = driver.findElement(By.xpath("//span[text()[contains(.,'Account & Lists')]]"));
		Actions a=new Actions(driver);
		a.moveToElement(account).moveToElement(baby).click().build().perform();
	}

}
