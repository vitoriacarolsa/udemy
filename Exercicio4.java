package exercicios;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
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


	}

}
