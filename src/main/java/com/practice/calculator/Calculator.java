package com.practice.calculator;

import java.lang.Math;

class Calculator{
	
	public int add(int a, int b){
		return a+b;
	}

	public int sub(int a, int b){
		return a-b;
	}

	public int mul(int a, int b){
		return a*b;
	}	

	public int div(int a, int b){
		try{
			return a/b;
		}
		catch(ArithmeticException e){
			return 0;
		}
	}
	
	public int mod(int a, int b){
		return a%b;
	}

	public double power(int a, int b){
		return Math.pow(a,b);
	}

	public int negate(int a){
		return a*(-1);
	}

	public int factorial(int a){
		int res = 1;
		for(int i = 1; i<=a; i++){
			res *= i;
		}
		return res;
	}

	public double square(int a){
		return Math.pow(a,2);
	}

	public double cube(int a){
		return Math.pow(a,3);
	}
}