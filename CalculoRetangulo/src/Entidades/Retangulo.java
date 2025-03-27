package Entidades;

import java.lang.*;

public class Retangulo {
	
	private Float height;
	private Float weight;
	
	
	public Retangulo(float height, float weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float calculateArea() {
		return weight * height;
	}
	
	public float calculatePerimeter() {
		return (2 * weight) + (2 * height);
	}
	
	public float calculateDiagonal() {
		return (float) Math.sqrt((Math.pow(weight, 2) + Math.pow(height, 2)));
	}

	@Override
	public String toString() {
		return "Area = " + calculateArea() + "\n Perímetro = " + calculatePerimeter()
				+ "\n Diagonal = " + calculateDiagonal();
	}
	
	
	
	
	

}
