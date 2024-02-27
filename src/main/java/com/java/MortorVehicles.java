package com.java;

public class MortorVehicles implements Motors{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MortorVehicles fm=new MortorVehicles();
		fm.audi();
		fm.benz();
		fm.bmw();
		fm.ford();
		fm.kia();
		fm.tesla();
		fm.suv();
	}
public void benz()
{
	System.out.println("benz is a car");
}
public void tesla()
{
	System.out.println("tesla is a car");
}
public void audi()
{
	System.out.println("audi q7");
}

public void kia() {
	// TODO Auto-generated method stub
	System.out.println("kia is a car");
}

public void ford() {
	// TODO Auto-generated method stub
	System.out.println("ford is a car");
}

public void suv() {
	// TODO Auto-generated method stub
	System.out.println("suv is a type of car");
}

public void bmw() {
	// TODO Auto-generated method stub
	System.out.println("bmw x5");
}
}
