package com.org;

import org.openqa.selenium.chrome.ChromeDriver;

public class Michale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.michaels.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//p[text()[contains(.,'Sign In')]]");
		driver.findElementByXPath("//p[text()[contains(.,'Sign In')]]").click();
		driver.findElementByXPath("//input[@id='email']").sendKeys("test123");
		driver.findElementByXPath("//input[@name='password']").sendKeys("iam Sushma");
		driver.findElementByXPath("//p[text()[contains(.,'Remember me')]]").click();
		driver.findElementByXPath("//button[@form='sign-in-form']").click();
		//driver.findElementByXPath("//button[@name='login']").click();

	}

}
