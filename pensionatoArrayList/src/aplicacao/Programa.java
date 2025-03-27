package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entidades.Room;
import services.ComparadorDeQuartos;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <Room> pensionato = new ArrayList<>(Collections.nCopies(10, null));
		
		String name;
		String email;
		int numberOfRoom, numberOfRooms;
		
		System.out.print("Quantos quartos serão alugados? ");
		numberOfRooms = sc.nextInt();
		
		for (int i = 0; i < numberOfRooms; i++) {
			System.out.println("Aluguel #" + (i+1));
			sc.nextLine();
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			do {
				System.out.print("Quarto: ");
				numberOfRoom = sc.nextInt();
			} while(numberOfRoom >= 0 && numberOfRoom >= 10);
			
			
			if (pensionato.get(numberOfRoom) != null) {
				System.out.println("Esse quarto já está ocupado");
				i--;
				continue;
			}
			
			//adcionando um dado em um índice específico
			pensionato.set(numberOfRoom, new Room(name, email, numberOfRoom));
			
			
		
			
		}
		System.out.println();
		System.out.println("\nQuartos ocupados:");
		for (Room quarto : pensionato) {
			if(quarto != null) {
				System.out.println(quarto);
			}
			
		}
		  
		sc.close();
		
	}

}
