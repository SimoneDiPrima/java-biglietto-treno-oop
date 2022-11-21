package org.mobilitygeneration.italy;

import java.io.IOException;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("quanti km vuoi percorrere??");
		int kilometers = sc.nextInt();
		System.out.print("quanti anni hai??");
		int age = sc.nextInt();
		
		try {
			
			
			Biglietto p = new Biglietto(kilometers, age);
			System.out.print(p);	
			
		} catch(Exception e) {
			
			System.err.println(e.getMessage());
		}
			
	}
	
}
