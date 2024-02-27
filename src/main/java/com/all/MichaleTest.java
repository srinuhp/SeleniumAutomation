package com.all;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MichaleTest {
	@Test
	public void michale()
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.michaels.com/signin?returnUrl=/?cm_mmc=SearchBrand-_-google-_-MICH_Search_US_N_Brand_TrademarkCore_Branded_Exact-_-Trademark+-+Branded+Core+Term&kenshoo_ida=tm_brand&kpid=go_cmp-324266651_adg-24658685771_ad-348913281960_aud-1637777398205:kwd-92295400_dev-c_ext-_prd-&gad_source=1&gclid=CjwKCAiAlcyuBhBnEiwAOGZ2S4n7wnfzss1Krc1-SHSP3xDwb92T33Tb5zGI65rEAmILmaCkK-JyWhoCYYUQAvD_BwE&headerAuthCta=true");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("apple@gail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("apple1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
