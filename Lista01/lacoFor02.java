package Lista01;

import java.util.Scanner;

public class lacoFor02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero,contadorPar=0,contadorImpar=0;
		
		for(int i = 0;i<=10;i++) {
			
			System.out.printf("\nDigite o número %d: ",i);
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				contadorPar++;
			}else {
				contadorImpar++;
			}
		}
		
		System.out.printf("\nTotal de números pares: %d",contadorPar);
		System.out.printf("\nTotal de números ímpares: %d",contadorImpar);
	}

}
