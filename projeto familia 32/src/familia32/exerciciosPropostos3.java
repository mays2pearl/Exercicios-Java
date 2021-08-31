package familia32;

//  3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.


import java.util.Scanner;

public class exerciciosPropostos3 {
	
	public static void main(String[] args) {
		
		int segundos,horas,minutos,difSegundos;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nQual total de segundos do evento?");
		segundos = leia.nextInt();
		
		horas = segundos/3600;
		minutos = segundos/60;
		difSegundos = horas + minutos;
		
		System.out.println("\nO evento durara "+horas+"hrs "+minutos+" minutos e "+difSegundos+" segundos");
		
		
		
		
		
		
		

}
}