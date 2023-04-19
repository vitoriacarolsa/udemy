
package exercicios;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

	/* int a,b,c,d,diferenca;
		
		Scanner num=new Scanner(System.in);
		a = num.nextInt();
		b = num.nextInt();
		c = num.nextInt();
		d = num.nextInt();
		
		System.out.println ("Os números digitados foram: " + a+b+c+d);
		
		diferenca= (a* b - c * d);
		
		System.out.println ("Os números digitados foram: " + a+b+c+d+ " e a sua diferença é: " + diferenca);
		
		
		
		double numerof, horast, valorH, salario;
		
		Scanner funcionario=new Scanner (System.in);
		numerof=funcionario.nextDouble();
		horast=funcionario.nextDouble();
		valorH=funcionario.nextDouble();
		salario=horast*valorH;
		
		System.out.println ("O número do funcionario é: " + numerof+" ele recebe "+valorH+" por horas trabalhadas, e ele trabalha por " + horast+ " seu salário é "+ salario);
		
		

		
		double codigop1, numeroDep1, valorp1, codigoP2, numeroDep2, valorp2,valorPagar;
		
		Scanner calculaPeca=new Scanner (System.in);
		
		System.out.println ("Ola, digite os valores de: código, numero dae peças, e o valor de cada uma, informações da peça 1!");
		
		codigop1=calculaPeca.nextDouble();
		numeroDep1=calculaPeca.nextDouble();
		valorp1=calculaPeca.nextDouble();
	
		System.out.println ("Agora digite as informações da peça 2");
		
		codigoP2=calculaPeca.nextDouble();
		numeroDep2=calculaPeca.nextDouble();
		valorp2=calculaPeca.nextDouble();
		
		valorPagar= (numeroDep1*valorp1) + (numeroDep2*valorp2);
		
		System.out.println ("O total a pagar é de: " + valorPagar);
*/
		
/*		
		
	
		double A, B, C;
		
		Scanner calculaForma=new Scanner (System.in);
		
		
		A=calculaForma.nextDouble();
		B=calculaForma.nextDouble();
		C=calculaForma.nextDouble();
		
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		triangulo= A*C/2;
		circulo= 3.14159 * C * C;
		trapezio= (A + B) / 2.0 * C;
		quadrado= B * B;
		retangulo= A * B;
		
		System.out.println ("Triangulo " + triangulo +" circulo" + circulo + " trapezio "+ trapezio + " quadrado "+ quadrado + " retangulo "+ retangulo);

	*/
		
		/*int numero;
		Scanner verifica=new Scanner (System.in);
		
		numero=verifica.nextInt();
		
		if (numero<0) 
			System.out.println("O número é negativo!");
		
		else {
			System.out.println ("O número é positivo!");
		}
		*/
		/*
		int numeroip;
		Scanner imparpar=new Scanner (System.in);
		
		numeroip=imparpar.nextInt();
		
		if (numeroip%2==0) {
			System.out.println ("O número é par!");
		}
		
		else {
			System.out.println ("O número é impar!");
		}
		*/
		
		/*int numero1, numero2;
		
		System.out.println("Digite dois números, e veja se eles são multiplos: ");
		
		Scanner multiplos=new Scanner (System.in);
		
		numero1=multiplos.nextInt();
		numero2=multiplos.nextInt();
		
		if (numero1 % numero2 == 0) {
			System.out.println ("Os números são múltiplos");
		}
	    else {
				System.out.println("Os números não são múltiplos");
			
		} */
		
		/*
		int horaInicial, horaFinal,resultado,resultadoF;
		
		Scanner jogo=new Scanner (System.in);
		horaInicial=jogo.nextInt();
		horaFinal=jogo.nextInt();
		
		resultado= 24-horaInicial;
		resultadoF=resultado+horaFinal;
		
		System.out.println("O jogo durou " +resultadoF);
		*/
		
		/*
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
		*/
		
		double numero;
		System.out.println("Qual número deseja verificar?");
		Scanner intervalo=new Scanner (System.in);
		numero=intervalo.nextDouble();
		
		if (numero>=0 && numero<=25) 
			System.out.println ("Intervalo 0-25");
		
		else if (numero>=25 && numero<=50) 
    	  System.out.println ("Intervalo 25-50");
    	
		else if (numero>=50 && numero<=75) 
		System.out.println ("Intervalo 50 - 75");
		
	    else if (numero>=75 && numero<=100) 
		System.out.println("Intervalo 75 - 100");
		
	    else{
	    	System.out.println("Fora do intervalo");
	    }
	}}
		
	


