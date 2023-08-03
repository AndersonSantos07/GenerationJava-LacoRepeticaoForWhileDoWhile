package Lista02;

import java.util.Scanner;

public class lacoWhile02 {

	public static void main(String[] args) {
		int idade,sexo,categoria;
		int contBackend=0,contMulhFrontend=0,contHomMobile=0,contMulhFullStack=0;
		String contLoop = "S";
		
		Scanner leia = new Scanner(System.in);
		
		while(!contLoop.equalsIgnoreCase("n")) {
			
			System.out.println("\nDigite a sua Idade: ");
			idade = leia.nextInt();
			
			System.out.println("\nSexo ");
			System.out.println("\n1 - Masculino");
			System.out.println("\n2 - Feminino");
			System.out.println("\n3 - Outros");
			
			
			System.out.println("\nDigite o seu Sexo: ");
			sexo = leia.nextInt();
			
			System.out.println("\nCategoria ");
			System.out.println("\n1 - Backend");
			System.out.println("\n2 - Frontend");
			System.out.println("\n3 - Mobile");
			System.out.println("\n4 - FullStack");
			
			System.out.println("\nDigite a sua Categoria: ");
			categoria = leia.nextInt();
			
			if(categoria == 1)
			{
				contBackend++;
				
			}else if(sexo == 2 && categoria == 2) 
			{
				
				contMulhFrontend++;
				
			}else if(sexo == 1 && categoria == 3 && idade>40) 
			{
				contHomMobile++;
			}else if(sexo == 2 && categoria == 4 && idade<30)
			{
				contMulhFullStack++;
			}
			
			
			
			System.out.println("\nDeseja cadastrar mais um colaborador? (S/N)");
			contLoop = leia.next();
		}
		
		System.out.printf("\nTotal de pessoas desenvolvedoras Backend: %d",contBackend);
		System.out.printf("\nTotal de mulheres desenvolvedoras Frontend: %d",contMulhFrontend);
		System.out.printf("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: %d",contHomMobile);
		System.out.printf("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: %d",contMulhFullStack);
		
		
		

	}

}
