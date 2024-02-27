package com.java;

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Transport ds=new Transport();
ds.vehicle();
ds.vehicle(3);
ds.vehicle("bus", 50);
	}
public void vehicle()
{
	System.out.println("two wheeler vehicle");
}
public void vehicle(int persons)
{
	System.out.println("people can travel on vehicle"+persons);
}
public void vehicle(String type,int persons)
{
	System.out.println("vehicle is"+type);
	System.out.println("number of persons"+persons);
}
}
