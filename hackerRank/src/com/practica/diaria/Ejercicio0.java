package com.practica.diaria;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ejercicio0 {

 private static final Scanner scanner = new Scanner(System.in);
 
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

//		/* Declare second integer, double, and String variables. */
//		int  a = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		double b = scanner.nextDouble();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
		String texto = scanner.nextLine();
		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.

//		/* Print the sum of both integer variables on a new line. */
//		System.out.println(i+a);
//		System.out.println(d+a);
		System.out.println(s+texto);
		/* Print the sum of the double variables on a new line. */

		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */

		
		int j = scan.nextInt();
		String st = scan.nextLine();
		
		System.out.println(j+st);
		//System.out.println();
		scan.close();
	}
}
