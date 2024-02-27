package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Macys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.macys.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByXPath("//span[text()[contains(.,'Sign In')]]]").click();
		driver.findElementByXPath("//input[@name='user.email_address']").sendKeys("test123");
		driver.findElementByXPath("//input[@id='pw-input']").sendKeys("iam Sushma");
		driver.findElementByXPath("//input[@id='stay-signedin]'");
		driver.findElementByXPath("//span[@id='signin-text']").click();
		//driver.findElementByXPath("//button[@name='login']").click();

	}

}
