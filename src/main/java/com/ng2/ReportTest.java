package com.ng2;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportTest {
	public static int i=0;
	public static ChromeDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeSuite
	public void begin()
	{
	report=new ExtentReports(".//reports//SushmaReport.html");
	report.addSystemInfo("Environment", "QA");
	report.addSystemInfo("Author","Shushma");
	test=report.startTest("To verify toolsQA website page");
	
	}
	
	@Test
	public void tooldQA() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String exp="https://toolsqa.com/selenium-training?q=banner#enrol";
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("abcd");
		test.log(LogStatus.PASS, "Entered FirstName"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("cdfg123");
		test.log(LogStatus.PASS, "Entered LasName"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
		test.log(LogStatus.PASS, "Entered Email"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("456789321");
		test.log(LogStatus.PASS, "Entered Mobile"+test.addScreenCapture(snap()));
		WebElement country =driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(country);
		s.selectByVisibleText("Albania");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("single");
	}
	
	public String snap() throws IOException
	{
		Random r=new Random();
		String dummy="";
		if(r.nextInt()!=0)
		{
			i=i+1;
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dest=new File(".//images//pic"+i+".png");
			FileUtils.copyFile(src, dest);
			dummy=dest.getAbsolutePath();
		}
		return dummy;
	}
	
	@AfterSuite
	public void finish()
	{
		report.endTest(test);
		report.flush();
	}

}
