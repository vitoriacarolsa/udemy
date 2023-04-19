
package exercicios;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

	    int a,b,c,d,diferenca;
		
		Scanner num=new Scanner(System.in);
		a = num.nextInt();
		b = num.nextInt();
		c = num.nextInt();
		d = num.nextInt();
		
		System.out.println ("Os números digitados foram: " + a+b+c+d);
		
		diferenca= (a* b - c * d);
		
		System.out.println ("Os números digitados foram: " + a+b+c+d+ " e a sua diferença é: " + diferenca);
		
		
	
	}}
