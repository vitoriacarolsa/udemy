package exercicios;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		int numeroip;
		Scanner imparpar=new Scanner (System.in);
		
		numeroip=imparpar.nextInt();
		
		if (numeroip%2==0) {
			System.out.println ("O número é par!");
		}
		
		else {
			System.out.println ("O número é impar!");
		}
		

	}

}
