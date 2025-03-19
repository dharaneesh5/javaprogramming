package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class pandi {

	public static void main(String args[])
		{
		String name;
		Scanner scan=new Scanner(System.in);
		String str=scan.next();	
		char [] ch= {'a','e','i','o','u','A','E','I','O','U'};
		int n=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(arr[i]==ch[i])
					n++;
			}
			
		}
		}
	
}
