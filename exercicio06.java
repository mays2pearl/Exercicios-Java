import java.util.Scanner;

/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

public class exercicio06 {

	public static void main(String[] args) {

		int num,soma=0,media=0;
		
	Scanner leia = new Scanner (System.in);
		
		
		
		do{
			
			System.out.println("\nDigite um numero: ");
			
			num = leia.nextInt();
			
			if(num>0 && num% 3 == 0) {
				
				soma = soma + num++;
			
				
				media++;
			}

	}while(num!=0);
		
		System.out.println("\nA média dos números múltiplos de 3 é "+soma / media);

}
}
