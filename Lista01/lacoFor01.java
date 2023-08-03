package Lista01;

import java.util.Scanner;

public class lacoFor01 {

	public static void main(String[] args) {
		
		int n1,n2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		n1 = ler.nextInt();
		System.out.println("\nDigite o último número do intervalo:");
		n2 = ler.nextInt();
		
		if(n1 > n2) {
			System.out.println("\nIntervalo inválido!");
		}else {
			
			for(int i=n1; i <=n2;i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.printf("\n %d é múltiplo de 3 e 5! ",i);
				}
				
			}
		}
		
		

	}

}
