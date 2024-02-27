package com.org;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Globals {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/samplepagetest/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Select drpCountry = new Select(driver.findElement(By.name("g2599-experienceinyears")));
	drpCountry.selectByVisibleText("0-1");
	//drpCountry.selectByVisibleText("1-3");
	//drpCountry.selectByVisibleText("3-5");
	//drpCountry.selectByVisibleText("5-7");
	
}

}