package lista06;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Meses do Ano:");
		System.out.println("1 - Janeiro");
		System.out.println("2 - Fevereiro");
		System.out.println("3 - Março");
		System.out.println("4 - Abril");
		System.out.println("5 - Maio");
		System.out.println("6 - Junho");
		System.out.println("7 - Julho");
		System.out.println("8 - Agosto");
		System.out.println("9 - Setembro");
		System.out.println("10 - Outubro");
		System.out.println("11 - Novembro");
		System.out.println("12 - Dezembro");
		
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("O Mes do Ano Escolhido foi Janeiro!");
				break;
		case 2:
			System.out.println("O Mes do Ano Escolhido foi Fevereiro!");
				break;
		case 3:
			System.out.println("O Mes do Ano Escolhido foi Março!");	
				break;
		case 4:
			System.out.println("O Mes do Ano Escolhido foi Abril!");
				break;
		case 5:
			System.out.println("O Mes do Ano Escolhido foi Maio!");
				break;
		case 6:
			System.out.println("O Mes do Ano Escolhido foi Junho!");
				break;
		case 7:
			System.out.println("O Mes do Ano Escolhido foi Julho!");
				break;
		case 8:
			System.out.println("O Mes do Ano Escolhido foi Agosto!");
				break;
		case 9:
			System.out.println("O Mes do Ano Escolhido foi Setembro!");
				break;
		case 10:
			System.out.println("O Mes do Ano Escolhido foi Outubro!");
				break;
		case 11:
			System.out.println("O Mes do Ano Escolhido foi Novembro!");
				break;
		case 12:
			System.out.println("O Mes do Ano Escolhido foi Dezembro!");
				break;

		default:
			System.out.println("Numero Inserido Não Corresponde a Nenhum Mes!");
				break;
		}
		
		sc.close();
		
	}
}
