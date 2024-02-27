package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VeggiesTest {
		public void tomato()
		{
			System.out.println("tomato is a veggie");
		}
	@AfterTest
	public void onion()
	{
		System.out.println("onion is a veggie");
	}
	@BeforeTest
	public void eggplant()
	{
		System.out.println("eggplant is a veggie");
	}
	@AfterMethod
	public void potatos()
	{
		System.out.println("potatos is a veggie");
	}
	@Test
	public void methi()
	{
		System.out.println("methi is a veggie");
	}
	@Test
	public void spinach()
	{
		System.out.println("spinach is a veggie");
	}
	@Test
	public void redleaves()
	{
		System.out.println("redleaves is a veggie");
	}
	@Test
	public void cucumber()
	{
		System.out.println("cucumber is a veggie");
	}
	}
