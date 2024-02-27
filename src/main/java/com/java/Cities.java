package com.java;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cities sh=new Cities();
sh.cities(500);
sh.cities();
sh.cities("NewYork", 2500);

	}
public void cities()
{
	System.out.println("2 states");
}
public void cities(int people)
{
	System.out.println("states contain"+people);
}
public void cities(String type,int people)
{
	System.out.println("cities is"+type);
	System.out.println("number of people"+people);
}
}
