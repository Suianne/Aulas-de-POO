package aplicacao;

import java.util.*;

import entidades.Room;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String email;
		int numberOfRoom, numberOfRooms;
		
		System.out.print("Quantos quartos serão alugados? ");
		numberOfRooms = sc.nextInt();
		
		Room[] pensionato;
		
		pensionato = new Room[10];
		
		for (int i=0; i < numberOfRooms; i++) {
			System.out.println("Aluguel #" + (i+1));
			sc.nextLine();
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			do {
				System.out.print("Quarto: ");
				numberOfRoom = sc.nextInt();
			} while(numberOfRoom > 0 && numberOfRoom < 10);
				
			pensionato[numberOfRoom-1] = new Room(name, email);
			
		}
		
		for (int i = 0; i < pensionato.length; i++) {
			if (pensionato[i] != null) {
				System.out.print(i);
				System.out.println(pensionato[i]);
			}
		}
		
		sc.close();
		
		

	}

}
