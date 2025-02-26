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
		System.out.print("Nota 1: ");
		proofNoteOne = sc.nextFloat();
		System.out.print("Nota 2: ");
		proofNoteTwo = sc.nextFloat();
		System.out.print("Nota 3: ");
		proofNoteThree = sc.nextFloat();
		
		Estudante estudante = new Estudante(name, proofNoteOne, proofNoteTwo, proofNoteThree);
		
		estudante.calculateAverage(proofNoteOne, proofNoteTwo, proofNoteThree);
		
		System.out.println(estudante);

	}
	
}
