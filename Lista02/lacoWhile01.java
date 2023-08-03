package Lista02;

import java.util.Scanner;

public class lacoWhile01 {

	public static void main(String[] args) {
		
		int idade=1,contadorMenor=0,contadorMaior=0;
		Scanner ler = new Scanner(System.in);
		
		
		while(idade > 0) {
			
			System.out.printf("\nDigite uma idade: ");
			idade = ler.nextInt();
			
			if(idade <= 21) {
				contadorMenor++;
				
			}else if(idade > 50) {
				contadorMaior++;
			}
		}
		
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d",contadorMenor);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d",contadorMaior);

	}

}
