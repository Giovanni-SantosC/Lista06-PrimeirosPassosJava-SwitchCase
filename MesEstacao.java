package lista06;

import java.util.Scanner;

public class MesEstacao {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Numero de um Mes:");
		int mes = sc.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Mês Janeiro Estação do Ano Verão!");
			break;
		case 2:
			System.out.println("Mês Fevereiro Estação do Ano Verão!");
			break;
		case 3:
			System.out.println("Mês Março Estação do Ano Outono!");
			break;
		case 4:
			System.out.println("Mês Abril Estação do Ano Outono!");
			break;
		case 5:
			System.out.println("Mês Maio Estação do Ano Outono!");
			break;
		case 6:
			System.out.println("Mês Junho Estação do Ano Inverno!");
			break;
		case 7:
			System.out.println("Mês Julho Estação do Ano Inverno!");
			break;
		case 8:
			System.out.println("Mês Agosto Estação do Ano Inverno!");
			break;
		case 9:
			System.out.println("Mês Setembro Estação do Ano Primavera!");
			break;
		case 10:
			System.out.println("Mês Outubro Estação do Ano Primavera!");
			break;
		case 11:
			System.out.println("Mês Novembro Estação do Ano Primavera!");
			break;
		case 12:
			System.out.println("Mês Dezembro Estação do Ano Verão!");
			break;

		default:
			System.out.println("Numero Invalido, Não Corresponde a Nenhum Mês.");
			break;
		}
		sc.close();
		
	}
	
}
