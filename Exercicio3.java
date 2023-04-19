package exercicios;
import java.util.Scanner;

public class Exercicio3 {

public static void main(String[] args) {
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


	}

}
