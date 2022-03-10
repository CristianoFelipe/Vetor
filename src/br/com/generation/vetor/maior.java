
package br.com.generation.vetor;
 
import java.util.Scanner;


     public class maior {

	public static void main(String[] args) {
		int num[] = new int[5];// declarando um vetor de 5 posicoes
		int i;
		int maior1 = 0;
		int menor = 10000;

		Scanner input = new Scanner(System.in);
		// varrer o vetor
		for (i = 0; i < 5; i++) {

			System.out.println("Digite um numero");
			num[i] = input.nextInt();
			// Grava o Maior Valor de num[i] em maior1
			if (num[i] > maior1) {
				maior1 = num[i];

			}

			// Grava o Menor Valor de num[i] em menor
			if (num[i] < menor) {
				menor = num[i];

			}

		}
		System.out.println("o maior e:  " + maior1);
		System.out.print("o menor e:  " + menor);

	}

}
