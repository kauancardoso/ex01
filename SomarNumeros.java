package exercicio01pacote;

import java.util.Scanner;

class SomaNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args) {
		//variaveis
		int num1 , num2 , soma;
		
		//leituras
		System.out.println("Digite um numero");
		num1 = sc.nextInt();
		System.out.println("Digite outro numero");
		num2 = sc.nextInt();
		
		//somar
		
		soma = num1 + num2;
		
		//mostrar tela
		
		System.out.println("Soma:"  + soma);
		}
}
