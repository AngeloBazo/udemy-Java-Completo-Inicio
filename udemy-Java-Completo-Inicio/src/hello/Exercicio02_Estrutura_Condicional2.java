package hello;

import java.util.Scanner;

public class Exercicio02_Estrutura_Condicional2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x;

		System.out.print("Digite um nº inteiro, positivo ou negativo:");

		x = teclado.nextInt();

		if (x % 2 == 0) {
			System.out.println(x + " é um nº par");

		} else {
			System.out.println(x + " é um nº ímpar");

		}

	}

}
