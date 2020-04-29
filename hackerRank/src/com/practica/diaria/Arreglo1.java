package com.practica.diaria;

import java.util.Scanner;

public class Arreglo1 {

	 private static final Scanner scanner = new Scanner(System.in);

//	    public static void main(String[] args) {
//	    	StringBuffer sb = new StringBuffer();
//	    	
//	        int n = scanner.nextInt();
//	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	        int[] arr = new int[n];
//	        int[] arrInverse = new int[n];
//	        
//	        String[] arrItems = scanner.nextLine().split(" ");
//	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	        for (int i = 0; i < n; i++) {
//	            int arrItem = Integer.parseInt(arrItems[i]);
//	            arr[i] = arrItem;
//	            sb = sb.append(arr[i]+ ",");
//	           
//	        }
//	        System.out.println(sb.reverse());
//	        // se puede evitar el segundo ciclo si se permitiera este metodo::
//	        
//		    // StringBuffer invertido = sb.reverse();
////	        for (int j = arr.length-1; j>=0; j--) {
////	        	int i =0;
////	        	arrInverse[i]=arr[j];
////	        	i=i++;
////	        	//System.out.println("Valor de indice i = "+i);
////	        	//System.out.println("Valor de indice j "+j);
////	        	//System.out.println("inverso del array: "+arrInverse[i]);
////	        	sb.append(arrInverse[i]);
////	        }
////	        String resultado = sb.toString();
////	        resultado = resultado.replaceAll("(?!^|$)", " ");
////	        
////	        System.out.println(resultado);
//	        scanner.close();

        
	   // }
	 //revisar por que este si sirve
	 
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	        }
	        
	        for(int i=n-1; i>=0; i--){
	            System.out.print(arr[i]+" ");
	        }
	        in.close();
	    }
}
