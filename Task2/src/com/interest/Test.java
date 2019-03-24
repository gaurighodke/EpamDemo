package com.interest;

import static org.junit.jupiter.api.Assertions.*;

class Test 
{
	Interest i=new Interest();
	@org.junit.jupiter.api.Test
	
	void test_SI()
	{
		assertEquals(151.5,i.simple_interest(2020,3,2.5));
		assertEquals(360,i.simple_interest(1500,1.2,20));
	}
	
	@org.junit.jupiter.api.Test
	
	void test_CI()
	{
		assertEquals(121500,i.compound_interest(1500,4,2,2));
		assertEquals(2478600,i.compound_interest(3400, 4, 3,2));
	}
}
