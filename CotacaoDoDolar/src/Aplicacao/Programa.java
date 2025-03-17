package Aplicacao;

import java.util.*;

import Util.cotacaoDolar;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double priceInDolar;
		double quantityDolar;
		
		System.out.print("Qual é o preço em dólar? ");
		priceInDolar = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		quantityDolar = sc.nextDouble();
		
		
		double resultado;
		
		resultado = cotacaoDolar.convertToDolar(quantityDolar, priceInDolar);
		
		System.out.printf("Valor a ser pado em reais = %.2f%n", resultado);
		
		
		
		
		sc.close();
		

	}

}
