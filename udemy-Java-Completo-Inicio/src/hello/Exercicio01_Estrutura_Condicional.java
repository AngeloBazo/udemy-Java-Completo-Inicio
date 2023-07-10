package hello;

import java.util.Scanner;

public class Exercicio01_Estrutura_Condicional {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x;

		System.out.print("Digite um nº inteiro, positivo ou negativo:");

		x = teclado.nextInt();

		if (x >= 0) {
			System.out.println(x + " é um nº positivo");

		} else {
			System.out.println(x + " é um nº negativo");

		}

	}

}
