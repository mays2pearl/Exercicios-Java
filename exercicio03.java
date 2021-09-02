//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)

import java.util.Scanner;

public class exercicio03 {
	
	public static void main(String[] args) {
		
		int idade=0,tot21=0,tot50=0;
		
		Scanner leia = new Scanner (System.in);
		
	
		
		while(idade<=99){
			
			System.out.println("\nDigite a idade: ");
			
			idade = leia.nextInt();
			
			if(idade<21) {
				
				tot21 ++;
				
				
			}if(idade>50) {
				
				tot50 ++;
				
				
			}else {
				
			}
			
			
			
		}
		
		System.out.println("\nQuantidade de pessoas com menos de 21 anos: "+tot21+", quantidade de pessoas com mais de 50 anos: "+tot50);
		
		

}

}