package exercicios;
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		double codigoItem;
		double quantidade;
		double qntItem1,qntItem2, qntItem3, qntItem4, qntItem5;
		double valor1, valor2, valor3, valor4, valor5;
		
		System.out.println ("Olá, digite o código da comida");
		Scanner comida= new Scanner (System.in);
		codigoItem=comida.nextDouble();
		
		System.out.println ("Agora, digite a quantidade desejada ");
		Scanner tanto= new Scanner (System.in);
		quantidade=tanto.nextDouble();
		
		
		valor1= quantidade*4;
		valor2=quantidade*4.50;
		valor3=quantidade*5;
		valor4=quantidade*2;
		valor5=quantidade*1.50;
		
		if (codigoItem==1) {
			System.out.println ("Pagara um valor de: " + valor1);
		}
		else if (codigoItem==2) {
			System.out.println ("Pagara um valor de: " + valor2);
		}
		
		else if (codigoItem==3) {
			System.out.println ("Pagara um valor de: " + valor3);
		}
		
		else if (codigoItem==4) {
			System.out.println ("Pagara um valor de: " + valor4);
		}
		else if (codigoItem==5) {
			System.out.println ("Pagara um valor de: " + valor5);
		}
		
		else {
			System.out.println("Número invalido, não temos este código.");
		}
		

	}

}
