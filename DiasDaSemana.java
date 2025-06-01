package lista06;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dias da Semana: ");
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda-Feira");
		System.out.println("3 - Terça-Feira");
		System.out.println("4 - Quarta-Feira");
		System.out.println("5 - Quinta-Feira");
		System.out.println("6 - Sexta-Feira");
		System.out.println("7 - Sabado");
		
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Sua Escolha do Dia da Semana foi Domingo!");
			break;
		case 2:
			System.out.println("Sua Escolha do Dia da Semana foi Segunda!");
		    break;
		case 3:
			System.out.println("Sua Escolha do Dia da Semana foi Terça-Feira!");
			break;
		case 4:
			System.out.println("Sua Escolha do Dia da Semana foi Quarta-Feira!");
			break;
		case 5:
			System.out.println("Sua Escolha do Dia da Semana foi Quinta-Feira!");
			break;
		case 6:
			System.out.println("Sua Escolha do Dia da Semana foi Sexta-Feira!");
			break;
		case 7:
			System.out.println("Sua Escolha do Dia da Semana foi Sabado!");
			break;
			
		default:
			System.out.println("Dia da Semana Invalido!");
			break;
		}
		
		
		sc.close();
	}
}
	
