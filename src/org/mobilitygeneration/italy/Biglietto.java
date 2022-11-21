package org.mobilitygeneration.italy;

public class Biglietto {
	private double kilometers;
	private int age;
	public double prezzo = kilometers * 0.21;
	

	private double calcolaSconto;
	public Biglietto(int kilometers,int age)throws Exception{
		setKilometers(kilometers);
		setAge(age);
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = kilometers * 0.21;
		this.prezzo = prezzo;
	}
	public double getKilometers() {
		return kilometers;
	}
	
	
	public void setKilometers(double kilometers) throws Exception {
		if(kilometers <= 0 ) {
			throw new Exception("devi fare almeno un kilometro!");
		}
		this.kilometers = kilometers;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age <= 0 ) {
			throw new Exception("il cliente deve avere un eta di almeno un anno!");
		}
		this.age = age;
	}
	public double getCalcolaSconto(double kilometers , double age) {
	 if(age < 18) {
		 calcolaSconto = kilometers * 0.21 * 20;
	 }
	 if(age >=65 ) {
		 calcolaSconto = kilometers * 0.21 * 40;
	 }
		return this.calcolaSconto = calcolaSconto;
	}
	
	@Override
	public String toString() {
		
		return  "il passeggero ha:" + age + "anni" + "\nil costo del biglietto è : " + prezzo;
	}
		
	}

