import fr.diginamic.projetCounter.Counter;
import fr.diginamic.projetCounter.CounterPair;

public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Counter counter2 = new Counter();
		int a = counter.getValue();
		System.out.println(counter.equals(counter2));
		counter.inc();
		int b = counter.getValue();
		System.out.println(a);
		System.out.println(b);
		String coucou = counter.toString();
		System.out.println(coucou);
		System.out.println(counter.equals(counter2));
		
		Counter counter3 = new Counter(1,2);
		System.out.println(counter.equals(counter3));
		System.out.println(counter3.equals(counter));
		
		counter3.inc();
		int c = counter3.getValue();
		System.out.println(c);
		System.out.println(counter3.toString());
		
		System.out.println("Test du compteur pair");
		CounterPair counter4 = new CounterPair();
		System.out.println(counter4.toString());
		counter4.inc();
		System.out.println(counter4.toString());
		System.out.println(counter.equals(counter4));
		counter.inc();
		System.out.println(counter.equals(counter4));
		
		System.out.println(Counter.getGlobalCounter());
	}
}
