package com.java;

public class RS {

	public static void main(String[] args) {
		String str= "hello rama", fstr="",lstr="";
        char ch;
       
      System.out.println("hello rama"); 
       
      for (int i=0; i<str.length(); i++)
      {
	        ch= str.charAt(i);
	        if(ch==' ' )
	        {
	        	lstr=fstr;
	        	fstr="";
	        }
	        else
	        {
	        	fstr=ch+fstr;
	        }
      }
      System.out.println( lstr + " "+ fstr );
    }
}
