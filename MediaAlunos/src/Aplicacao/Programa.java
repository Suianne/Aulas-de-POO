package Aplicacao;

import java.util.*;

import Entidades.Estudante;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		float proofNoteOne;
		float proofNoteTwo;
		float proofNoteThree;
		
		System.out.print("Nome: ");
		name = sc.nextLine();
		
		do {
			System.out.print("Nota 1: ");
			proofNoteOne = sc.nextFloat(); 
		} while(proofNoteOne > 30);
		
		do {
			System.out.print("Nota 2: ");
			proofNoteTwo = sc.nextFloat(); 
		} while(proofNoteTwo > 35);
		
		do {
			System.out.print("Nota 3: ");
			proofNoteThree = sc.nextFloat(); 
		} while(proofNoteThree > 35);
		
		Estudante estudante = new Estudante(name, proofNoteOne, proofNoteTwo, proofNoteThree);
		
		
		System.out.println(estudante);
		
		sc.close();

	}
	
}
