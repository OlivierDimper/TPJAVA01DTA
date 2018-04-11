package fr.diginamic.projetCounter;

public class Counter {
	private int increment;
	private int valeur;
	private static int globalCounter = -1;
	
	public int getValue() {
		return this.valeur;
	}
	
	public void inc() {
		this.valeur += increment;
		globalCounter += increment;
	}
	
	public String toString() {
		String chaine = "valeur : " + this.valeur + " (increment " + this.increment + ")";
		return chaine;
	}
	
	public static int getGlobalCounter() {
		return globalCounter;
	}
	
	public boolean equals(Counter counter) {
		return this.valeur == counter.valeur;
	}
	
	public Counter(int val, int inc) {
		this.valeur = val;
		this.increment = inc;
		if (globalCounter ==-1) {
			globalCounter = 0;
		}
	}
	
	public Counter() {
		this(0,1);
	}
}
