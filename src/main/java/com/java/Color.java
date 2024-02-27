package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> hs=new ArrayList<String>();
hs.add("red");
hs.add("green");
hs.add("orange");
hs.add("pink");
hs.add("purple");
System.out.println(hs);
hs.add("white");
hs.add("black");
hs.add("brown");
hs.add("blue");
System.out.println(hs);
System.out.println(hs.get(4));
Iterator<String> it=hs.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
