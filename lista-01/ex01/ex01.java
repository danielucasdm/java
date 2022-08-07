package ex01;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeMarido, nomeEsposa;
		int anoAtual = 2018;
		int anoCasamento, totalAnos;
		
		System.out.println("Insira o nome do marido:");
		nomeMarido = sc.nextLine();
		System.out.println("Nome o nome da esposa: ");
		nomeEsposa = sc.nextLine();
		
		System.out.println("Informe o ano do casamento:");
		anoCasamento = sc.nextInt();
		
		totalAnos = anoAtual - anoCasamento;
		System.out.println("Tempo de casamento: " + totalAnos + " anos");
		
		
		
		sc.close();
	}

}
