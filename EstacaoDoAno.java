package lista06;

import java.util.Scanner;
public class EstacaoDoAno {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Estações do Ano: ");
		System.out.println("1 - Primavera");
		System.out.println("2 - Verão");
		System.out.println("3 - Outono");
		System.out.println("4 - Inverno");
		
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("A Estação Escolhida foi Primavera!");
			break;
		case 2:
			System.out.println("A Estação Escolhida foi Verão!");
			break;
		case 3:
			System.out.println("A Estação Escolhida foi Outono!");
			break;
		case 4:
			System.out.println("A Estação Escolhida foi Inverno!");
			break;
		default:
			System.out.println("O Valor Inserido Não Corresponde a Nenhuma Estação do Ano!");
			break;
		}
		
		
		sc.close();
	} 
}
