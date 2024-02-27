package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> li=new ArrayList<String>();
li.add("mango");
li.add("apple");
li.add("kiwi");
li.add("drango");
li.add("pineapple");
li.add("peach");
System.out.println(li);
li.add("custardapple");
li.add("watermelon");
li.add("orange");
li.add("guva");
li.add("plum");
System.out.println(li);
System.out.println(li.get(3));
Iterator<String> it = li.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}


	}

}
