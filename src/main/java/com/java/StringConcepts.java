package com.java;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name1 = "sushma";
String name2 = "sushma";
String name3 = new String("sushma");
System.out.println(name1 != name2);
System.out.println(name1 == name2);
System.out.println(name3 != name2);
System.out.println(name3 == name2);
// name2 = "sush"
System.out.println(name1+" "+ name2);
System.out.println(name1 != name2);
System.out.println(name1 == name2);
 
System.out.println(System.identityHashCode(name1));
System.out.println(System.identityHashCode(name2));
System.out.println(System.identityHashCode(name3));
System.out.println(name3.equals(name2));
	}

}
