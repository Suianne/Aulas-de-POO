package Entidades;

public class Estudante {
	private String name;
	private float proofNoteOne, proofNoteTwo, proofNoteThree, average;
	private boolean approval;
	
	public Estudante() {
		
	}
	
	public Estudante(String name, float proofNoteOne, float proofNoteTwo, float proofNoteThree) {
		super();
		this.name = name;
		this.proofNoteOne = proofNoteOne;
		this.proofNoteTwo = proofNoteTwo;
		this.proofNoteThree = proofNoteThree;
		calculateAverage(proofNoteOne, proofNoteTwo, proofNoteThree);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getProofNoteOne() {
		return proofNoteOne;
	}

	public void setProofNoteOne(float proofNoteOne) {
		this.proofNoteOne = proofNoteOne;
		calculateAverage(proofNoteOne, proofNoteTwo, proofNoteThree);
	}

	public float getProofNoteTwo() {
		return proofNoteTwo;
	}

	public void setProofNoteTwo(float proofNoteTwo) {
		this.proofNoteTwo = proofNoteTwo;
		calculateAverage(proofNoteOne, proofNoteTwo, proofNoteThree);
	}

	public float getProofNoteThree() {
		return proofNoteThree;
	}

	public void setProofNoteThree(float proofNoteThree) {
		this.proofNoteThree = proofNoteThree;
		calculateAverage(proofNoteOne, proofNoteTwo, proofNoteThree);
	}
	
	private void calculateAverage (float proofNoteOne, float proofNoteTwo, float proofNoteThree) {
		this.average = proofNoteOne + proofNoteTwo + proofNoteThree;
	}
	
	public String defineApproval() {
		if (this.average >= 60.00) {
			this.approval = true;
			return "Aprovado";
		} else {
			this.approval = false;
			return "Reprovado";
		}
		
	}
	
	public float calculateRest() {
		if (!this.approval) {
			return 60.00f - this.average;
		}
		
		return 0.0f;
	}

	@Override
	public String toString() {
		String result = "Nota final: " + average + "\n" + defineApproval();
		
		if (!this.approval) {
			result += "\n Faltaram " + calculateRest() + " pontos";

		}
		
		return result;
		
	}
	
	
	
	
}
