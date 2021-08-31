package familia32;

//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.


import java.util.Scanner;

public class exercicioProposto2 {
	
	public static void main(String[] args) {
		
		int dias,meses,anos,difDias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nQual total de dias você tem?");
		dias = leia.nextInt();
		
		anos = dias / 365;
		meses = dias / 30;
		difDias = meses - anos;
		
		System.out.println("\nSua idade em anos é "+anos+" em meses é "+meses+" e em dias é "+difDias);
		
		
		
		
		
		
		
		
	}

}
