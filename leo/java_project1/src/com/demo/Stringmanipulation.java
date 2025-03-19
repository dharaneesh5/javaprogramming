package com.demo;

public class Stringmanipulation {
	public static void main(String args[])
	{
	String name="pandi selvam";
	String obj=new String("pandi");
		System.out.println(name==obj);
		System.out.println(name.equals(obj));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.toCharArray());
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf(105,2));
		System.out.println(name.lastIndexOf(105,5));
		System.out.println(name.substring(3,8));
		char[] a=name.toCharArray();
				System.out.println(a);
		System.out.println(name.split("i"));
		String[] b=name.split("i");
		System.out.println(name.trim());
		System.out.println(name.isBlank());
		System.out.println(name.isEmpty());
		System.out.println(name.concat(obj));
		System.out.println(name.replace('a','i'));
		System.out.println(name.replaceAll("pandi selvam","pandimurugan"));
		System.out.println(name.replaceAll("(.*)an(.*)","murgan"));
	}



}
