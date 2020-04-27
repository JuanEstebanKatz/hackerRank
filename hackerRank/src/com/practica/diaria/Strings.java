package com.practica.diaria;

import java.util.Scanner;

public class Strings {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		//sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for(int i =0;i<n; i++) {
			String cadena = sc.next();
			combinacionCadenas(cadena);
		}
		sc.close();
	}
	
	public static String combinacionCadenas (String cadenaTexto) {
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		String resultado = "";
		
		char[] myArray = cadenaTexto.toCharArray();
		
		for(int j = 0; j<myArray.length; j+=2) {
			sb = sb.append(myArray[j]);
		}
		for(int k = 1; k<myArray.length; k+=2) {
			sb2 = sb2.append(myArray[k]);
		}
		resultado = sb + " " + sb2;
		System.out.println(resultado);
		return resultado;
	}
}