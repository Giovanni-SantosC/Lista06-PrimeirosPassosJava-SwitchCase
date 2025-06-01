package lista06;

	import java.util.Scanner;
public class Calculadora {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Valor: ");
		float numero01 = sc.nextFloat();
		System.out.println("Digite o Segundo Valor: ");
		float numero02 = sc.nextFloat();
		
		System.out.println("Escolha o Tipo de Conta: ");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		char caracter = sc.next().charAt(0);
		
		float resultado;
		
		switch (caracter) {
		case '+':
			resultado = numero01 + numero02;
			System.out.println("A Soma dos Dois Valores São: "+resultado);
			break;
		case '-':
			resultado = numero01 - numero02;
			System.out.println("A Subtração dos Dois Valores São: "+resultado);
			break;
		case '*':
			resultado = numero01 * numero02;
			System.out.println("A Multiplicação dos Dois Valores São: "+resultado);
			break;
		case '/':
			resultado = numero01 / numero02;
			System.out.println("A Divisão dos Dois Valores São: "+resultado);
			break;
		default:
			System.out.println("Caracter Inserido Invalido!");
			break;
		}
		
		
		sc.close();
	}
}
