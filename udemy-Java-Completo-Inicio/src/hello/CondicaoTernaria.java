package hello;

public class CondicaoTernaria {

	public static void main(String[] args) {

		int a, b, c, d, e;

		a = 2;
		b = 4;
		c = 50;
		d = 80;

		e = (a > b) ? c : d;

		System.out.println(e);

		// ------------------------------//

		String f = (10 != 3) ? "Maria" : "Alex";

		System.out.println(f);

		f = (10 < 3) ? "Maria" : "Alex";

		System.out.println(f);
		

	}

}
