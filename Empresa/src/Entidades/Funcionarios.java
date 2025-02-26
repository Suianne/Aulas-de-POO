package Entidades;

public class Funcionarios {
	private String name;
	private float grossSalary;
	private float tax;

	public Funcionarios(String name, float grossSalary, float tax) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}
	
	public float calculateNetSalary() {
		return grossSalary - tax;
	}
	
	public void resetGrossSalary(float add) {
		this.grossSalary = this.grossSalary + ((add*grossSalary)/100);
	}

	@Override
	public String toString() {
		return "Empregado: " + name + ", R$ " + calculateNetSalary();
	}
	
	
	
	
	
	
	
}

