package hello;

import java.text.DecimalFormat;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		double x = 10.35784;

		System.out.println(x);

		System.out.printf("%.2f%n", x);

		System.out.printf("%.4f%n", x);

		System.out.printf("Olá %n Oi \n Hello");

		System.out.println();

		Locale.setDefault(Locale.US);

		System.out.printf("%.4f%n", x);

		System.out.printf("Resultado = %.2f metros %n ", x);

		Locale.setDefault(new Locale("pt", "BR"));

		String nome = "Angelo";
		int idade = 40;
		double renda = 15000.00;
		int anos = 5;

		System.out.printf("%s tem %d anos e quer ganhar R$%.2f em %d anos %n", nome, idade, renda, anos);

	}

}
