package com.practice.calculator;

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
}