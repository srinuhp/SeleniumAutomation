package com.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChercherTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement table  = driver.findElementByXPath("//table[@id='webtable']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++) 
		{
		List<WebElement> coloumns = rows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<coloumns.size();j++)
		{
			String text = coloumns.get(j).getText();
			if (text.equals("Selenium Webdriver"))
			{
				System.out.println(coloumns.get(2).getText());
			}
		}
		}
	}
}
