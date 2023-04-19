package exercicios;
import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
int horaInicial, horaFinal,resultado,resultadoF;
		
		Scanner jogo=new Scanner (System.in);
		horaInicial=jogo.nextInt();
		horaFinal=jogo.nextInt();
		
		resultado= 24-horaInicial;
		resultadoF=resultado+horaFinal;
		
		System.out.println("O jogo durou " +resultadoF);

	}

}
