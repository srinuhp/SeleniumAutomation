package com.test;

import org.testng.annotations.Test;

public class StatesTest {
	@Test(dependsOnMethods= {"atlanta"})
public void newjersey()
{
	System.out.println("newjersey is a state");
}
	@Test(dependsOnMethods= {"florida"})
public void washingtondc()
{
	System.out.println("washingtondc is a state");
}
	@Test
public void florida()
{
	System.out.println("florida is a state");
}
	@Test(dependsOnMethods= {"washingtondc"})
public void atlanta()
{
	System.out.println("atlanta is a state");
}
}
