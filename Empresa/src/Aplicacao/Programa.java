package Aplicacao;

import java.util.*;

import Entidades.Funcionarios;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		float grossSalary;
		float tax;
		float add;
		
		System.out.print("Nome: ");
		name = sc.next();
		System.out.print("Salário Bruto: ");
		grossSalary = sc.nextFloat();
		System.out.print("Imposto: ");
		tax = sc.nextFloat();
		
		Funcionarios funcionario = new Funcionarios(name, grossSalary, tax);
		
		System.out.println(funcionario);
		
		System.out.print("Qual o percentual de aumento do salário? ");
		add = sc.nextFloat();
		
		funcionario.resetGrossSalary(add);
		
		System.out.print("Dados atualizados: ");
		System.out.println(funcionario);
		
	}
}
