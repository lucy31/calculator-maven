package com.practice.calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.Math;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest{
	
	Calculator cal;

	@BeforeAll
	void initTest(){
		cal = new Calculator();		
	}
	
	@Test
	void add(){
		assertEquals(50, cal.add(20,30));
	}

	@Test
	void sub(){
		assertEquals(20, cal.sub(60,40));
	}

	@Test
	void mul(){
		assertEquals(100, cal.mul(5, 20));
	}	

	@Test
	void div(){
		assertAll(()->assertEquals(3, cal.div(6,2)),
			()->assertEquals(0, cal.div(5,0)));
	}
	
	@Test
	void mod(){
		assertEquals(2, cal.mod(10,4));
	}

	@Test
	void power(){
		assertEquals(9D, cal.power(3,2));
	}

	@Test
	void negate(){
		assertAll(()->assertEquals(-6, cal.negate(6)),
			()->assertEquals(5, cal.negate(-5)));
	}

	@Test
	void factorial(){
		assertEquals(120, cal.factorial(5));
	}
}