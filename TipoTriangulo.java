package lista06;

import java.util.Scanner;
public class TipoTriangulo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Primero Lado do Triângulo: ");
		double lado01 = sc.nextDouble();
		
		System.out.println("Digite o Segundo Lado do Triângulo: ");
		double lado02 = sc.nextDouble();
		
		System.out.println("Digite o Terceiro Lado do Triângulo: ");
		double lado03 = sc.nextDouble();
		
		int tipo = 0;
		
		if(lado01 + lado02 > lado03 && lado01 + lado03 > lado02 && lado02 + lado03 > lado01){
			 tipo = 1;
		}
			
		if(lado01 == lado02 && lado02 == lado03) {
			tipo = 2;
		}
		else if(lado01 == lado02 || lado02 == lado03 || lado01 == lado03) {
			tipo = 3;
		}
		
		
		switch (tipo) {
		case 1:
			System.out.println("Triângulo Escaleno!");
			break;
		
		case 3:
			System.out.println("Triângulo Isósceles!");
			break;
		
		case 2:
			System.out.println("Triângulo Equilátero!");
			break;
		default:
			System.out.println("Os Dados Fornecidos Não Formam um Triângulo!");
			break;
		}
		
		
		sc.close();
		
	}
	
	
}
