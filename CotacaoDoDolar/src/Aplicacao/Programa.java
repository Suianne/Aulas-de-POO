package Aplicacao;

import java.util.*;

import Entidades.Moeda;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float priceInDolar;
		float quantityDolar;
		
		System.out.print("Qual é o preço em dólar? ");
		priceInDolar = sc.nextFloat();
		System.out.print("Quantos dólares serão comprados? ");
		quantityDolar = sc.nextFloat();
		
		Moeda moeda = new Moeda(priceInDolar, quantityDolar);
		
		System.out.println(moeda);
		sc.close();
		

	}

}
