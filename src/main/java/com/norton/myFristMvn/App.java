package com.norton.myFristMvn;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String> c = new ArrayList<String>();
    	c.add("A");
    	c.add("B");
    	c.add("C");
    	ArrayList b = new ArrayList(c);
    	Object[] s = c.toArray();
       Class<String[]> x = (Class<String[]>) s.getClass();
       
       Object string  =null;
    	System.out.println((String)string);
      	System.out.println(Object[].class);
    	
        System.out.println( "Hello World!" );
    }
}
