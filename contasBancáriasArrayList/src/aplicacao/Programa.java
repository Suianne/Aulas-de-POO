package aplicacao;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import entidades.Client;

public class Programa {

	public static void main(String[] args) {
		//instância uma lista de clientes
		List <Client> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int numberOfCounts, numberOfCount;
		String name;
		char initialDeposit;
		float value;
		
		System.out.print("Quantas contas serão criadas? ");
		numberOfCounts = sc.nextInt();
		
		
		for (int i = 0; i < numberOfCounts; i++) {
			System.out.println("Informações da conta n° " + (i+1));
			
			System.out.print("Informe o número da conta: ");
			numberOfCount = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Informe o nome do titular da conta: ");
			name = sc.nextLine();
			
			System.out.print("Haverá um depósito inicial (s/n)? ");
			initialDeposit = sc.next().charAt(0);
			
			while (initialDeposit != 's' && initialDeposit != 'n') {
				System.out.print("Opção inválida! Tente novamente.");
				initialDeposit = sc.next().charAt(0);
			}
			
			if (initialDeposit == 's') {
				System.out.print("Informe o valor do depósito inicial: ");
				value = sc.nextFloat();
				
			} else {
				value = 0;
			}
			
			Client client = new Client(numberOfCount, name, value);
			
			//adicionar os dados sempre no final da lista
			list.add(client);
		}
		
		for (Client x : list) {
			System.out.println(x);
		}
		
		sc.close();
		

	}

}
