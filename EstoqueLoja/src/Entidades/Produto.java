package Entidades;

public class Produto {
	
	private String name;
	private float price;
	private int quantity;
	
	public Produto(String name, float price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void addQuantity (int quantity) {
		this.quantity = this.quantity + quantity;
	}
	
	public void removeQuantity (int quantity) {
		if (quantity < this.quantity) {
			this.quantity = this.quantity - quantity;
		}
		
	}
	
	

	@Override
	public String toString() {
		return "Dados do produto:" + name + ", R$" + price + ", " + quantity + " unidades, Total: R$ " + quantity*price;
	}
	
	

}
