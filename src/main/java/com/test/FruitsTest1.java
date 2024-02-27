package com.test;

import org.testng.annotations.Test;

public class FruitsTest1 {
	@Test(dependsOnMethods= {"pineapple"})
public void apple()
{
	System.out.println("apple is  red");
}
	@Test(dependsOnMethods= {"kiwi"})
public void pineapple()
{
	System.out.println("pineapple is yellow");
}
	@Test(dependsOnMethods= {"apple"})
public void guva()
{
	System.out.println("guva is green");
}
	@Test()
public void kiwi()
{
	System.out.println("kiwi is green ");
}
	@Test(dependsOnMethods= {"guva"})
public void banana()
{
	System.out.println("banana is yellow");
}
}
