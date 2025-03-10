package Aplicacao;

import java.util.*;

import Entidades.Produto;

public class Programa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		float price;
		int quantity;
		
		System.out.println("Informe os dados do produto: ");
		System.out.print("Nome: ");
		name = sc.next();
		System.out.print("Preço: ");
		price = sc.nextFloat();
		System.out.print("Quantidade em estoque: ");
		quantity = sc.nextInt();
		
		Produto product = new Produto(name, price, quantity);
		
		System.out.println(product);
		
		System.out.print("Informe o número de produtos a serem adcionados no estoque: ");
		quantity = sc.nextInt();
		product.addQuantity(quantity);
		
		System.out.println(product);
		
		System.out.print("Informe a quantdade de produtos a serem retirados do estoque: ");
		quantity = sc.nextInt();
		product.removeQuantity(quantity);
		
		System.out.println(product);
		sc.close();
		
		
		
	}

}
