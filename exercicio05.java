import java.util.Scanner;

/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
public class exercicio05 {

	public static void main(String[] args) {
		
		int num,somaNum=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		
		do{
			
			System.out.println("\nDigite um numero: ");
			
			num = leia.nextInt();
		
			if(num>0) 
				
			somaNum = somaNum + num;
			
			
	}while(num!=0); 
		
		
		System.out.println("\nA soma dos numeros digitados �: "+somaNum);	

}
}