package com.practica.diaria;

public class Recursion {
	
	public static int suma(int n) {
		// caso Base
		if(n <=0) {
			return 0;
		}// Recursion...
		else {
			return n + suma(n-1);
		}
	}
	
	public static int factorial(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
	//5^3
	//5* 5*
	public static int exponente(int e, int p) {
		if(p<=0)
			return 1;
		else
			return e* exponente(e, p-1);
	}
	
public static void main(String[] args) {
	System.out.println(suma(3));
	System.out.println(factorial(5));
	System.out.println(exponente(5, 3));
}
}
