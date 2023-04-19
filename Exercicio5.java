package exercicios;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		int numero;
		Scanner verifica=new Scanner (System.in);
		
		numero=verifica.nextInt();
		
		if (numero<0) 
			System.out.println("O número é negativo!");
		
		else {
			System.out.println ("O número é positivo!");
		}

	}

}
