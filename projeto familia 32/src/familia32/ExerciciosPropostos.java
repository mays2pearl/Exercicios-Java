package familia32;

//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.


import java.util.Scanner;

public class ExerciciosPropostos {

	public static void main(String[] args) {
		
		int anos,meses,dias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nQuantos anos voc� tem?");
		anos = leia.nextInt();
		System.out.println("\nQual total de meses voc� tem?");
		meses = leia.nextInt();
		System.out.println("\nQual total de dias voc� tem?");
		dias = leia.nextInt();

		dias = anos * 365;
		

		System.out.println("\nSua idade em dias � " +dias);

	}

}
