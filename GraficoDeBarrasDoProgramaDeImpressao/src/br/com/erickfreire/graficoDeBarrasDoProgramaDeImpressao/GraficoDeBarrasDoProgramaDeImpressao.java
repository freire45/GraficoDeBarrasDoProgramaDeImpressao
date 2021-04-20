package br.com.erickfreire.graficoDeBarrasDoProgramaDeImpressao;

import java.util.Scanner;

/**
 * Programa em Java que exibe um gráfico de barras com asteriscos
 * @author Erick Freire
 * @version 1 - Criado em 20-04-2021 as 16:38
 */

public class GraficoDeBarrasDoProgramaDeImpressao {
	public static void main(String[] args) {
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que exibe um gráfico de barras: ");
		
		System.out.print("Informe o primeiro valor entre 1 e 30: ");
		numero1 = entrada.nextInt();
		
		while(numero1 < 1 || numero1 > 30) {
			System.out.print("Numero incorreto: Informe o primeiro valor entre 1 e 30: ");
			numero1 = entrada.nextInt();
		}
		
		System.out.print("Informe o segundo valor entre 1 e 30: ");
		numero2 = entrada.nextInt();
		
		while(numero2 < 1 || numero2 > 30) {
			System.out.print("Numero incorreto: Informe o segundo valor entre 1 e 30: ");
			numero2 = entrada.nextInt();
		}
		
		System.out.print("Informe o terceiro valor entre 1 e 30: ");
		numero3 = entrada.nextInt();
		
		while(numero3 < 1 || numero3 > 30) {
			System.out.print("Numero incorreto: Informe o terceiro valor entre 1 e 30: ");
			numero3 = entrada.nextInt();
		}
		
		System.out.print("Informe o quarto valor entre 1 e 30: ");
		numero4 = entrada.nextInt();
		
		while(numero4 < 1 || numero4 > 30) {
			System.out.print("Numero incorreto: Informe o quarto valor entre 1 e 30: ");
			numero4 = entrada.nextInt();
		}
		
		System.out.print("Informe o quinto valor entre 1 e 30: ");
		numero5 = entrada.nextInt();
		
		while(numero5 < 1 || numero5 > 30) {
			System.out.print("Numero incorreto: Informe o quinto valor entre 1 e 30: ");
			numero5 = entrada.nextInt();
		}
		
		System.out.println();
		
		for(int i = 1; i <= numero1; i++) {
			System.out.print("*");
			
		}
		
		System.out.println();
		
		for(int i = 1; i <= numero2; i++) {
			System.out.print("*");
			
		}
		
		System.out.println();
		
		for(int i = 1; i <= numero3; i++) {
			System.out.print("*");
			
		}
		
		System.out.println();
		
		for(int i = 1; i <= numero4; i++) {
			System.out.print("*");
			
		}
		
		System.out.println();
		
		for(int i = 1; i <= numero5; i++) {
			System.out.print("*");
			
		}
		
		System.out.println();
	}

}
