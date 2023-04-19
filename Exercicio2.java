package exercicios;
import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
		double numerof, horast, valorH, salario;
		Scanner funcionario = new Scanner(System.in);
		numerof = funcionario.nextDouble();
		horast = funcionario.nextDouble();
		valorH = funcionario.nextDouble();
		salario = horast * valorH;

		System.out.println("O número do funcionario é: " + numerof + " ele recebe " + valorH + " por horas trabalhadas, e ele trabalha por " + horast + " seu salário é " + salario);
	}

}
