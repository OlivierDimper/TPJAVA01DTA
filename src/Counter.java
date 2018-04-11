
public class Counter {
	private int increment;
	private int valeur;
	
	public int getValue() {
		return this.valeur;
	}
	
	public void inc() {
		this.valeur = this.valeur + increment;
	}
	
	public String toString() {
		String chaine = "valeur : " + this.valeur + " (increment " + this.increment + ")";
		return chaine;
	}
	
	public boolean equals(Counter counter) {
		return this.valeur == counter.valeur;
	}
	
	public Counter(int val, int inc) {
		this.valeur = val;
		this.increment = inc;
	}
	
	public Counter() {
		this.valeur = 0;
		this.increment = 1;
	}
}
