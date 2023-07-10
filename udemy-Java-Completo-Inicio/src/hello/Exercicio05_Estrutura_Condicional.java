package hello;

import java.util.Scanner;

public class Exercicio05_Estrutura_Condicional {

	public static void main(String[] args) {

		String codigoEspecificacaoPreco[][] = {

				{ "Código", "\tEspecificação", "\t\tPreço" },

				{ "1", "\tCachorro Quente", "\t\tR$4,50" },

				{ "2", "\tX-Salada", "\t\tR$4,50" },

				{ "3", "\tX-Bacon", "\t\t\tR$5,00" },

				{ "4", "\tTorrada simples", "\t\tR$2,00" },

				{ "5", "\tRefrigerante", "\t\tR$1,50" }

		};

		for (int i = 0; i < codigoEspecificacaoPreco.length; i++) {

			for (int j = 0; j < codigoEspecificacaoPreco[i].length; j++) {

				System.out.print(codigoEspecificacaoPreco[i][j]);

			}
			System.out.println();
			System.out.println("---------------------------------------");

		}

		Scanner teclado = new Scanner(System.in);

		System.out.println();
		System.out.println("Bem vindo(a) ao MC-Burger!!!");
		System.out.println();
		System.out.print("Digite o código do item escolhido:");

		int codigoDoItemEscolhido = teclado.nextInt();

		System.out.print("Digite a quantidade que deseja:");

		int quantidadeDoItemEscolhido = teclado.nextInt();

		double valorPagar;

		switch (codigoDoItemEscolhido) {
		case 1: {

			valorPagar = 4.5 * quantidadeDoItemEscolhido;

			System.out.printf("Valor a pagar: R$%.2f%n", valorPagar);
			break;

		}

		case 2: {

			valorPagar = 4.5 * quantidadeDoItemEscolhido;

			System.out.printf("Valor a pagar: R$%.2f%n", valorPagar);
			break;
		}
		case 3: {

			valorPagar = 5.0 * quantidadeDoItemEscolhido;

			System.out.printf("Valor a pagar: R$%.2f%n", valorPagar);
			break;
		}
		case 4: {

			valorPagar = 2.0 * quantidadeDoItemEscolhido;

			System.out.printf("Valor a pagar: R$%.2f%n", valorPagar);
			break;
		}
		case 5: {

			valorPagar = 1.5 * quantidadeDoItemEscolhido;

			System.out.printf("Valor a pagar: R$%.2f%n", valorPagar);
			break;
		}

		default:
			System.out.println("Item não existente");

			;
		}
	}

}
