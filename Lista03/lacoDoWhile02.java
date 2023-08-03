package Lista03;

import java.util.Scanner;

public class lacoDoWhile02 {

	public static void main(String[] args) {
		
		int numero=0,contador=0,somaTotal=0;
		float mediaTotal;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número qualquer: ");
			numero = ler.nextInt();
			
			if(numero % 3 == 0) {
				contador++;
				somaTotal+=numero;
			}
			
		}while(numero > 0);
		
		mediaTotal = somaTotal / contador;
		
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f", mediaTotal);

	}

}
