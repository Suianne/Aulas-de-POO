package aplicacao;

import java.util.*;

import entidades.Client;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfCounts;
		int numberOfCount;
		String name;
		char initialDeposit;
		float value = 0;
		
		System.out.print("Informe a quantidade de contas que deseja criar: ");
		numberOfCounts = sc.nextInt();
		
		Client[] contas;
		
		contas = new Client[numberOfCounts];
		
		for (int i = 0; i < contas.length; i++) {
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
			
			contas [i] = new Client(numberOfCount, name, value);
			
		}
		
		System.out.println("Imprimindo todas as contas que foram criadas: ");
		
		for(Client conta : contas) {
			System.out.println(conta);
		}
		
		
		sc.close();

	}

}
