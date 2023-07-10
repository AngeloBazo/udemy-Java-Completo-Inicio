package hello;

public class FormulaBhaskara {

	public static void main(String[] args) {

		double delta, a, b, c, x1, x2;

		a = 1;
		b = 0;
		c = -1444;

		delta = Math.pow(b, 2.0) - 4 * a * c;

		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.println("Delta: " + delta);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
	}

}
