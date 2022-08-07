package ex11;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, distancia;
		
		System.out.println("Digite o valor de x1:");
		x1 = sc.nextDouble();
		System.out.println("Digite o valor de x2:");
		x2 = sc.nextDouble();
		System.out.println("Digite o valor de y1:");
		y1 = sc.nextDouble();
		System.out.println("Digite o valor de y2:");
		y2 = sc.nextDouble();
		
		distancia =Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))) ;
		
		System.out.println("Distância euclidiana: " + distancia);
		
		sc.close();
	}

}
