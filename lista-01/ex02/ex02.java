package ex02;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			float a, b, quo;
			int resto;
			
			System.out.println("Informe o primeiro número:");
			a = sc.nextFloat();
			System.out.println("Informe o segundo número:");
			b = sc.nextFloat();
			
			quo = a/b;
			resto = (int) (a%b);
			
			System.out.println("O Dividendo dos numero informados = " + a);
			System.out.println("O Divisor dos numeros informados =" +  b);
			System.out.println("O Quociente dos numeros informados = " + quo);
			System.out.println("O Resto da Divisao dos numeos informados = " +  resto);
			
			sc.close();
		}

}