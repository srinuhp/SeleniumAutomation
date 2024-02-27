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

public class NumbersTest {
	@BeforeSuite
public  void nine() {
	System.out.println("i am a nine method");
}
	@AfterSuite
public  void eight() {
	System.out.println("i am a eight method");
}
	@BeforeClass
public  void seven() {
	System.out.println("i am a seven method");
}
	@AfterClass
public  void six() {
	System.out.println("i am a six method ");
}
	@BeforeMethod
public  void five() {
	System.out.println("i am a five method");
}
	@AfterMethod
public  void four() {
	System.out.println("i am a four method");
}
	@BeforeTest
public void three() {
	System.out.println("i am a three method");
}
@AfterTest
public  void two() {
	System.out.println("i am a two method");
}
@Test
public  void one() {
	System.out.println("i am a one method");
}
}
