package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class Test 
{
	Calculator c=new Calculator();
	@org.junit.jupiter.api.Test

	void test_Addition() 
	{
		assertEquals(10, c.Addition(5, 5));
		assertEquals(20, c.Addition(10, 10));
		assertEquals(122.3, c.Addition(89.8,32.5));
	}
	@org.junit.jupiter.api.Test
	void test_Division() 
	{
		assertEquals(1, c.Division(5, 5));
		assertEquals(2, c.Division(10, 5));
		assertEquals(3.4, c.Division(8.5,2.5));
		//assertEquals(3,c.Division(3,0));
		Assertions.assertThrows(ArithmeticException.class,()->c.Division(5, 0));
	}
	@org.junit.jupiter.api.Test
	void test_Multiplication() 
	{
		assertEquals(25, c.Multiplication(5, 5));
		assertEquals(50, c.Multiplication(10, 5));
		assertEquals(21.25, c.Multiplication(8.5,2.5));
	}
	@org.junit.jupiter.api.Test
	void test_subtraction() 
	{
		assertEquals(0,c.Subtraction(5,5));
		assertEquals(5, c.Subtraction(10, 5));
		assertEquals(6, c.Subtraction(8.5,2.5));
	}
}
