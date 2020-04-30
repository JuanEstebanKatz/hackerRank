package com.practica.diaria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryPractice {

	public static void main(String[] args) {
		
//		Map<String, String> englSpanDictrionary = new HashMap<String , String>();
//		englSpanDictrionary.put("Monday", "Lunes");
//		englSpanDictrionary.put("Tuesday", "Martes");
//		englSpanDictrionary.put("Wednesday", "Miercoles");
//		englSpanDictrionary.put("Thursday", "Jueves");
//		englSpanDictrionary.put("Friday", "Viernes");
//
//		System.out.println(englSpanDictrionary.get("Monday"));
//		//print all keys
//		System.out.println(englSpanDictrionary.keySet());
//		System.out.println(englSpanDictrionary.values());
//		
//		System.out.println("El tamaño del dicc es:"+englSpanDictrionary.size());
//		
//		System.out.println();
//		System.out.println();
//		Map<String, Boolean> shoppingLista = new HashMap<String , Boolean>();
//		
//		shoppingLista.put("Martillo", true);
//		shoppingLista.put("pan", Boolean.FALSE);
//		shoppingLista.put("oreo", Boolean.TRUE);
//		
//		System.out.println(shoppingLista.get("Martillo"));
//		System.out.println(shoppingLista.get("pan"));
//		System.out.println(shoppingLista.toString());
//		shoppingLista.clear();
//		System.out.println(shoppingLista.toString());
		
		  Scanner in = new Scanner(System.in);
		  Map<String, Integer> elementos = new HashMap<String , Integer>();
	        int n = in.nextInt();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            in.nextLine();
	            elementos.put(name, phone);
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            if(elementos.get(s) == null)
	                System.out.println("Not found");
	            else {
	                System.out.println(s + "=" + elementos.get(s));
	            }
	        }
	        in.close();
	}
}
