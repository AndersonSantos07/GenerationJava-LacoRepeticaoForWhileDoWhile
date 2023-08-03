package Lista03;

import java.util.Scanner;

public class lacoDoWhile01 {

	public static void main(String[] args) {
		int numero=0,somaTotal=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número qualquer: ");
			numero = leia.nextInt();
			
			if(numero>0) {
				somaTotal += numero;
			}
			
		}while(numero>0);
		
		System.out.printf("\nA soma dos números positivos é: %d", somaTotal);

	}

}
