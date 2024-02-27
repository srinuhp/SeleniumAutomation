package com.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FlowersSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> te=new HashSet<String>();
		te.add("jasmin");
		te.add("red rose");
		te.add("hibiscus");
		te.add("lily");
		System.out.println(te);
		te.add("dasiy");
		te.add("dahlia");
		te.add("lris");
		te.add("lavender");
		System.out.println(te);
		Iterator<String> it=te.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
