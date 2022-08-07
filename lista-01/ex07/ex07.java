package ex07;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float pTermo, n, r, an;
		
		System.out.println("Informe o valor do 1ª termo: ");
		pTermo = sc.nextFloat();
		System.out.println("Informe o valor de  n-ésimo:");
		n = sc.nextFloat();
		System.out.println("Informe o valor da razão:");
		r = sc.nextFloat();
		
		an = pTermo + n * r;
		
		System.out.println("O valor da P.A de N(an): " + an);
		
		sc.close();
	}

}
