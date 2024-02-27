package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FruitsTest {
	@BeforeSuite
	public void apple(){
		System.out.println("apple is a fruit");
	}
	@AfterSuite
	public void grapes()
	{
		System.out.println("grapes is a fruit");
	}
	@BeforeClass
	public void kiwi()
	{
		System.out.println("kiwi is a fruit");
	}
	@AfterClass
	public void oranges()
	{
		System.out.println("oranges is a fruit");
	}
	@BeforeMethod
	public void berries()
	{
		System.out.println("berries is a fruit");
	}
	@AfterMethod
	public void guva()
	{
		System.out.println("guva is a fruit");
	}
	@BeforeTest
	public void custardapple()
	{
		System.out.println("custardapple is a fruit");
	}
	@AfterTest
public void pinapple()
{
	System.out.println("pineapple is a fruit");
}
	@Test
public void dragon()
{
	System.out.println("dargon is a fruit");
}
}
