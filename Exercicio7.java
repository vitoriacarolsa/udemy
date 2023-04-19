package exercicios;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
int numero1, numero2;
		
		System.out.println("Digite dois números, e veja se eles são multiplos: ");
		
		Scanner multiplos=new Scanner (System.in);
		
		numero1=multiplos.nextInt();
		numero2=multiplos.nextInt();
		
		if (numero1 % numero2 == 0) {
			System.out.println ("Os números são múltiplos");
		}
	    else {
				System.out.println("Os números não são múltiplos");
			
		} 

	}

}
