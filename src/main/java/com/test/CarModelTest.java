package com.test;

import org.testng.annotations.Test;

public class CarModelTest {
	@Test(priority=0)
public void kia()
{
	System.out.println("kia is a car model");
}
	@Test(priority=2)
public void honda()
{
	System.out.println("honda is a car model");
}
	@Test(priority=1)
public void bmw()
{
	System.out.println("bmw is a car model");
}
	@Test(priority=4)
public void benz()
{
	System.out.println("benz is a car model");
}
	@Test(priority=3)
public void audi()
{
	System.out.println("audi is a car model");
}
	@Test
	public void apple()
	{
		System.out.println("apple is a fruit");
	}
	@Test
	public void banana()
	{
		System.out.println("banana is a fruit");
	}
}

