package Aplicacao;

import java.util.Scanner;

import Entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float height;
		float weight;
		
		System.out.print("Informe a altura do retângulo: ");
		height = sc.nextFloat();
		System.out.print("Informe a largura do retângulo: ");
		weight = sc.nextFloat();
		
		Retangulo retangulo = new Retangulo(height, weight);
		
		System.out.println(retangulo);
		
		

	}

}
