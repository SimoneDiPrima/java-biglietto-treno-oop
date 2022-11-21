package org.mobilitygeneration.italy;

public class Biglietto {
	private double kilometers;
	private int age;
	public double calcolaPrezzo;
	private int calcolaSconto;
	public Biglietto(int kilometers,int age)throws Exception{
		setKilometers(kilometers);
		setAge(age);
	}
	public double getKilometers() {
		return kilometers;
	}
	public double calcolaPrezzo(double kilometers,int age) {
		return calcolaPrezzo = kilometers *0.21;
	
	}
	
	public void setKilometers(int kilometers) throws Exception {
		if(kilometers <= 0 ) {
			throw new Exception("devi fare almeno un kilometro!");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age <= 0 ) {
			throw new Exception("il cliente deve avere un eta di almeno un anno!");
		}
	}
	public int getCalcolaSconto() {
		return calcolaSconto;
	}
	public void setCalcolaSconto(int calcolaSconto) {
		this.calcolaSconto = calcolaSconto;
	}
		
		
	}

