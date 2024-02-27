package com.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FruitSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> fs=new HashSet<String>();
fs.add("grapes");
fs.add("kiwi");
fs.add("peaches");
fs.add("pineapple");
fs.add("mango");
System.out.println(fs);
fs.add("custardapple");
fs.add("plum");
fs.add("watermelon");
fs.add("cherries");
fs.add("strawberries");
fs.add("blueberries");
System.out.println(fs);
Iterator<String> it=fs.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

	}

}
