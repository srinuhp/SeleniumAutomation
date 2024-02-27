package com.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.target.com/login?client_id=ecom-web-1.0.0&ui_namespace=ui-default&back_button_action=browser&keep_me_signed_in=true&kmsi_default=false&actions=create_session_signin");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath("//span[text()[contains(.,'Sign in')]]").click();
		driver.findElementByXPath("//span[text()[contains(.,'Sign in')]]").click();
		driver.findElementByXPath("//input[@id='username']").sendKeys("abcd@gmail.com");
		driver.findElementByXPath("//input[@name='password']").sendKeys("cdf");
		driver.findElementByXPath("//input[@id='keepMeSignedIn']").click();
		driver.findElementByXPath("//button[@id='login']").click();
		
		//driver.switchTo().frame("frame1").switchTo().frame("frame3");
		//driver.findElementByXPath("//input[@id='a']").click();
	}

}
