package ex05;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		double valorProduto;
		double desc;
		double valorDesconto;
	
		System.out.println("Insira o valor do produto:");
		valorProduto = sc.nextDouble();
	
		System.out.println("Insira o percentual de desconto:");
		desc = sc.nextDouble();
		desc = desc/100;
		valorDesconto = valorProduto - (desc * valorProduto);
	
		System.out.println("Valor do produto com o desconto: "  + valorDesconto);
	
	sc.close();
}

}

