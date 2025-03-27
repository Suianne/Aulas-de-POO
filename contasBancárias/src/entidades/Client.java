package entidades;

public class Client {
	private Integer numberOfAccount;
	private String name;
	private Float moneyInAccount;
	
	public Client() {
		
	}
	
	public Client(int numberOfAccount, String name, float moneyInAccount) {
		super();
		this.numberOfAccount = numberOfAccount;
		this.name = name;
		this.moneyInAccount = moneyInAccount;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfAccount() {
		return numberOfAccount;
	}

	public float getMoneyInAccount() {
		return moneyInAccount;
	}
	
	
	public void depositMoney(Float value) {
		this.moneyInAccount += value;
	}
	
	public void withdrawMoney (Float value) {
		this.moneyInAccount = (float) (this.moneyInAccount - 5.00);
		this.moneyInAccount -= value;
	}

	@Override
	public String toString() {
		return "Dados da Conta:\n Número:" + numberOfAccount  + ", Nome do Titular: " + name + ", Saldo: R$ " + moneyInAccount;
	}
}
