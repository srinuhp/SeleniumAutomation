package com.org;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Facebook {
	public static ChromeDriver driver;
public static int i=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		 driver=new ChromeDriver();
		 Facebook fb=new Facebook();
		driver.get("https://www.facebook.com/");
		fb.snap();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@name='email']").sendKeys("test123");
		driver.findElementByXPath("//*[@name='pass']").sendKeys("iam Sushma");
		driver.findElementByXPath("//button[@name='login']").click();
		fb.snap();
	}
	public void snap() throws IOException
	{
		Random r=new Random();
		{
			if(r.nextInt()!=0)
			{
				i=i+1;
			}
		}
	
	File scr=driver.getScreenshotAs(OutputType.FILE);
	File dest=new File(".//images//pic"+i+".png");
	FileUtils.copyFile(scr, dest);
	
	}

}
