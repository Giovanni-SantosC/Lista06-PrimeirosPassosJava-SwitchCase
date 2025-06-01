package lista06;

import java.util.Scanner;

public class CategoriaDeIdade {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Sua Idade: ");
		int idade = sc.nextInt();
		
		switch (idade / 10) {
		case 0:
		case 1:
			if(idade <= 12) {
				System.out.println("Categoria : Criança!");				
			}
			else {
				System.out.println("Categoria: Adolescente!");
			}
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Categoria: Adulto!");
			break;
			
		default:
			System.out.println("Categoria: Idoso!");
			break;
		}
		sc.close();
	}
	
}
