package ex08;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int varA;
		int varB;
		int aux;
		
		System.out.println("Insira o primeiro valor de A:");
		varA = sc.nextInt();
		System.out.println("Insira o segundo valor de B:");
		varB = sc.nextInt();
		
		aux = varA;
		varA = varB;
		varB = aux;
		
		System.out.println("Valor de A: | " + varA);
		System.out.println("Valor de B: | " +  varB);
		
		sc.close();
	}

}
