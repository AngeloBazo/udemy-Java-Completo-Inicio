package hello;

import java.util.Locale;
import java.util.Scanner;

public class Debug {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a largura:");
		double largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento:");
		double comprimento = sc.nextDouble();
		
		System.out.println("Digite o preço do m2:");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Área = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);
		
		sc.close();
		
		
		
		
		

	}

}
