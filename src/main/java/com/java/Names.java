package com.java;

public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="srini";		
String name2="anitha";
String name3="lakshmi";
String name6="funny";
String name7="giri";
String name8="madhuri";
String name9="bhavani";
String name4="jyothi";
String name5="LAKSHMI";
String name10="  ravi  kumar  ";
System.out.println(name5.toLowerCase());
System.out.println(name8.toUpperCase());
System.out.println(name2.length());
System.out.println(name3.equals(name5));
System.out.println(name3.equalsIgnoreCase(name5));
System.out.println(name2.concat(name3));
System.out.println(name3.toCharArray());
System.out.println(name9.contains("a"));
System.out.println(name8.charAt(3));
System.out.println(name10.trim());
System.out.println(name4.endsWith("tha"));
System.out.println(name4.endsWith("thi"));
System.out.println(name2.replace('t', 'i'));
System.out.println(name7.replaceAll("iri", "outham"));
System.out.println(name5.hashCode());
System.out.println(name3.hashCode());
char ch[]= name3.toCharArray();
System.out.println(ch.length);
for(int c=0;c<ch.length;c++)
{
	System.out.println(ch[c]);

	
}
	}
	

}
