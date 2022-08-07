package ex04;

import java.util.Scanner;

public class ex04 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double c, f;
		float conversao;
		
		System.out.println("Informe a temperatura em Celsius:");
		c = sc.nextDouble();
		
		f = c * (9.0/5.0)+32.0;
		
		System.out.println("Convertido para Fahrenheit: " + f+ " F");
		
		
		sc.close();
	}

	
}

