package com;

public class Calculator {

	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	
	public void div(int a, int b)
	{
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(5,15);
		cal.sub(5,15);
		cal.mul(5,15);
		cal.div(5,15);
	}
	
}
