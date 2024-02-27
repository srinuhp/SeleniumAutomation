package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement myframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(myframe);
	WebElement button1 = driver.findElement(By.xpath("//li[text()[contains(.,'Item 1')]]"));
	WebElement button3 = driver.findElement(By.xpath("//li[text()[contains(.,'Item 3')]]"));
	WebElement button5 = driver.findElement(By.xpath("//li[text()[contains(.,'Item 5')]]"));
	WebElement button7 = driver.findElement(By.xpath("//li[text()[contains(.,'Item 7')]]"));
	Actions a=new Actions(driver);
	a.keyDown(Keys.CONTROL).moveToElement(button1).click().moveToElement(button3).click().moveToElement(button5).click().moveToElement(button7).click().build().perform();
	}

}
