package ex06;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int consumo = 12;
		double tempoGasto, velocidadeMedia;
		
		System.out.println("Informe o tempo do percuso:");
		tempoGasto = sc.nextDouble();
		System.out.println("Informe a velocidade media:");
		velocidadeMedia = sc.nextDouble();
		
		double distancia = tempoGasto * velocidadeMedia;
		double litrosUsado = distancia / consumo;
		
		System.out.println("Tempo de do percuso: " + tempoGasto + " hrs");
		System.out.println("Velocidade media: " + velocidadeMedia + " Km/h");
		System.out.println("Distancia percorida: " + distancia  + " Km");
		System.out.println("Quantidade de litros ultilizado: " + litrosUsado + " L");
		
		sc.close();
	}

}
