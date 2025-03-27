package Entidades;

public class Produto {
	
	private String name;
	private Float price;
	private Integer quantity;
	
	public Produto(String name, Float price, Integer quantity) {
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

	public void setPrice(Float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void addQuantity (Integer quantity) {
		this.quantity = this.quantity + quantity;
	}
	
	public void removeQuantity (Integer quantity) {
		if (quantity < this.quantity) {
			this.quantity = this.quantity - quantity;
		}
		
	}
	
	

	@Override
	public String toString() {
		return "Dados do produto:" + name + ", R$" + price + ", " + quantity + " unidades, Total: R$ " + quantity*price;
	}
	
	

}
