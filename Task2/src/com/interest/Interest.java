package com.interest;

public class Interest 
{
	public double simple_interest(double p,double t,double r)
	{
		double SI=(p*t*r)/100;
		return SI;
	}
	
	public double compound_interest(double pr,double r,double t,double n)
	{
		double compound_interest=(pr*(Math.pow((1 + r/n),t*n))) ;
		return compound_interest;
	}
}
