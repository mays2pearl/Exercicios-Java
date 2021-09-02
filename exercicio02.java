import java.util.Scanner;

//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
public class exercicio02 {

	public static void main(String[] args) {
	
		int x,numero=0,par=0,impar=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		
		for(x=0;numero<10;numero++) {
			
	System.out.println("\nDigite um numero: ");
		
		x = leia.nextInt();
		
			if(x % 2 == 0) {
				
				par++;
				
				
			}else {
				
				impar ++;
				
			}
			
			
		}
			
		System.out.println("\nQuantidade de numeros pares: "+par);
		System.out.println("\nQuantidade de numeros impares: "+impar);
	}

}
