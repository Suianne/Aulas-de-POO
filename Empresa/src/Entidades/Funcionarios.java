package Entidades;

public class Funcionarios {
	private String name;
	private Float grossSalary;
	private Float tax;

	public Funcionarios(String name, Float grossSalary, Float tax) {
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

	public void setGrossSalary(Float grossSalary) {
		this.grossSalary = grossSalary;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}
	
	public float calculateNetSalary() {
		return grossSalary - tax;
	}
	
	public void resetGrossSalary(Float add) {
		this.grossSalary = this.grossSalary + ((add*grossSalary)/100);
	}

	@Override
	public String toString() {
		return "Empregado: " + name + ", R$ " + calculateNetSalary();
	}
	
	
	
	
	
	
	
}

