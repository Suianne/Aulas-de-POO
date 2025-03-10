package Entidades;

public class Moeda {
	private float priceInDolar;
	private float quantityDolar;
	private float IOF = 6;
	
	public Moeda(float priceInDolar, float quantityDolar) {
		super();
		this.priceInDolar = priceInDolar;
		this.quantityDolar = quantityDolar;
	}

	public float getPriceInDolar() {
		return priceInDolar;
	}

	public void setPriceInDolar(float priceInDolar) {
		this.priceInDolar = priceInDolar;
	}

	public float getQuantityDolar() {
		return quantityDolar;
	}

	public void setQuantityDolar(float quantityDolar) {
		this.quantityDolar = quantityDolar;
	}
	
	public float dolarsInReais() {
		return (float) (((this.priceInDolar*this.quantityDolar)*this.IOF)/100) + this.priceInDolar * this.quantityDolar;
	}

	@Override
	public String toString() {
		return "Valor a ser pago em reais = " + dolarsInReais();
	}
	
	
	
	
}
