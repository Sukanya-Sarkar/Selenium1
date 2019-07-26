package com.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a, i;
		System.out.println("enter the value");
		a=sc.nextInt();
		while (a>0)
		{
			i=a%10;
			a=a/10;
			System.out.print(i);
		}

	}

}
