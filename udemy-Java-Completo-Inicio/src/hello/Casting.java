package hello;

public class Casting {

	public static void main(String[] args) {

		int x, y;
		double resultado;

		x = 5;
		y = 2;

		resultado = x / y;

		System.out.println(resultado);

		resultado = (double) x / y;

		System.out.println(resultado);

	}

}
