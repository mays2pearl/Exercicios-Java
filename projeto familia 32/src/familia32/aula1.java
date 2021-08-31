package familia32;

import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {

		float nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner (System.in);

			System.out.println("\nDigite a Primeira nota: ");
			nota1 = leia.nextFloat();
			System.out.println("\nDigite a segunda nota: ");
			nota2 = leia.nextFloat();
			System.out.println("\nDigite a terceira nota: ");
			nota3 = leia.nextFloat();
			
			media = (nota1 + nota2 + nota3) /3;
			
			System.out.printf("\nA média: %.2f",media);
			
			
	}

}
