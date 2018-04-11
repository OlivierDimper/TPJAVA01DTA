
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
	}
}
