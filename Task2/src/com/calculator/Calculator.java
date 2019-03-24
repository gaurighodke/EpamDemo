package com.calculator;
 
public class Calculator 
{
	public double Addition(double a,double b) 
	{
		double c=a+b;
		return c;
	}
	
	public double Subtraction(double a,double b) 
	{
		double c=a-b;
		return c;
	}
	public double Multiplication(double a,double b) 
	{
		double c=a*b;
		return c;
	}
	public double Division(double a,double b) 
	{
		double c=a/b;
		if(b==0)
		{
			throw new ArithmeticException();   
		}
		else 
		{
			return c;
		}
		
		
	}
}
