package Aplicacao;

import java.util.*;

import Entidades.Cliente;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int numberOfAccount;
		String name;
		char initialDeposit;
		float value = 0;
		
		System.out.print("Informe o número da conta: ");
		numberOfAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Informe o nome do titular da conta: ");
		name = sc.nextLine();
		System.out.println("Haverá um depósito inicial (s/n)? ");
		initialDeposit = sc.next().charAt(0);
		
		while (initialDeposit != 's' && initialDeposit != 'n') {
			
			System.out.println("Opção inválida! Tente novamente.");
			initialDeposit = sc.next().charAt(0);
		}
		
		if(initialDeposit == 's') {
			System.out.print("Informe o valor do depósito inicial: ");
			value = sc.nextFloat();
		} else {
			value = 0;
		}
		
		Cliente client = new Cliente(numberOfAccount, name, value);
		
		
		System.out.println(client);
		
		System.out.print("Informe um valor de Depósito: ");
		value = sc.nextFloat();
		client.depositMoney(value);
		
		System.out.println(client);
		
		System.out.print("Informe um valor de saque: ");
		value = sc.nextFloat();
		client.withdrawMoney(value);
		
		System.out.println(client);
		
		sc.close();
		

	}

}
