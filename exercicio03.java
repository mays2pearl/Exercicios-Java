import java.util.Scanner;

//3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//categoria ela se encontra:
// 10-14 infantil
// 15-17 juvenil
// 18-25 adulto
public class exercicio03 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nQual sua idade?: ");
		
		idade= leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			
			System.out.println("\nVocê se encontra na categoria infantil!");
			
		}else if(idade>=15 && idade<=17) {
			
			System.out.println("\nVocê se encontra na categoria juvenil!");
			
		}else if(idade>=18 && idade<=25) {
			
			
			System.out.println("\nVocê se encontra na categoria adulto!");
		}else {
			
			System.out.println("\nVocê se encontra fora de nossas categorias!");
		}
	}

}
