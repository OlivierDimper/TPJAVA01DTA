
public class Counter {
	private int increment = 1;
	private int valeur = 0;
	
	public int getValue() {
		return this.valeur;
	}
	
	public void inc() {
		this.valeur++;
	}
	
	public String toString() {
		String chaine = "valeur : " + this.valeur + " (increment " + this.increment + ")";
		return chaine;
	}
	
	public boolean equals(Counter counter) {
		return this.valeur == counter.valeur;
	}
}
