package ex10;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			double x, y, eq;
			
			System.out.println("Informe o valor de A:");
			x = sc.nextDouble();
			System.out.println("Informe o valor de B:");
			y = sc.nextDouble();
			
			eq = 2 * (Math.sqrt(3 * x + 30) / 3) + Math.pow(y - 32, 4);
			
			System.out.println("Resultado:" + eq);
			
		}
	}
