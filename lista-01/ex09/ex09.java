package ex09;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area, raio, pi;
		pi = 3.1415;
		
		System.out.println("Informe o raio da esfera:");
		raio = sc.nextDouble();
		
		area = 2 * pi * raio;
		
		System.out.println("A area da esfera:" + area);
				
		sc.close();
	}

}
