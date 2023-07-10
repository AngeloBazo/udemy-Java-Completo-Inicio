package hello;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		String digiteAlgo;

		char c;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite algo:");

		digiteAlgo = teclado.nextLine();

		System.out.println(digiteAlgo);

		System.out.println();

		System.out.println("Digite algo:");

		c = teclado.next().charAt(0);

		System.out.println(c);

		teclado.close();

	}

}
