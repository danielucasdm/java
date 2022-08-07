package ex03;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			String nome;
			System.out.println("Digite seu nome:");
			nome = sc.nextLine();
			int idade;
			System.out.println("Digite sua idade");
			idade = sc.nextInt();
			
			int resultado;
			
			resultado = idade * 365;
			
			System.out.println(nome + ", seu num. de dias é: " + resultado);
			
			
			sc.close();
		}
	}

