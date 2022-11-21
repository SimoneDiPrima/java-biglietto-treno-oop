package org.mobilitygeneration.italy;

public class Biglietto {
	private double kilometers;
	private double age;
	private double calcolaSconto;
	private boolean flexible;
	private int LocalDateTime;
	
	
	
	
	public Biglietto(double kilometers,double age , boolean flexible)throws Exception{
		setKilometers(kilometers);
		setAge(age);
	}
	
	public double getPrezzo() {
	
		double prezzo = (kilometers * 0.21) - getCalcolaSconto(kilometers ,age) ;
		if(isFlexible()) {
			prezzo = prezzo + (10/100);
		}
		return prezzo;
	}
	
	public double getKilometers() {
		return kilometers;
	}
	public boolean isValidKm() {
		
		return kilometers >=0;
		
	}
	
	public void setKilometers(double kilometers) throws Exception {
		if(kilometers <= 0 ) {
			throw new Exception("devi fare almeno un kilometro!");
		}
		this.kilometers = kilometers;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) throws Exception {
		if(age <= 0 ) {
			throw new Exception("il cliente deve avere un eta di almeno un anno!");
		}
		this.age = age;
	}
	public double getCalcolaSconto(double kilometers , double age) {
		double calcolaSconto = 0;
	 if(age < 18) {
		calcolaSconto = (kilometers * 0.21) * 0.20;
	 }
	 if(age >=65 ) {
		calcolaSconto =  (kilometers * 0.21) * 0.40;
	 }
		return this.calcolaSconto = calcolaSconto;
	}
	public boolean isFlexible() {
		 return true;
	}
	public void setFlexible(boolean flexible) {
		this.flexible = flexible;
	}
	public int getLocalDateTime() {
		return LocalDateTime;
	}
	public void setLocalDateTime(int localDateTime) {
		LocalDateTime = localDateTime;
	}
	@Override
	public String toString() {
		
		return  "il passeggero ha:" + age + "anni" + "\nil costo del biglietto è : "
		+ getPrezzo() + "€";
	}
	
		
	}

