package Util;

public class cotacaoDolar {
	
	private static double IOF = 6;
	public static double convertToDolar (double quantityDollar, double priceDollar) {
		return (((quantityDollar*priceDollar)*IOF/100) + quantityDollar*priceDollar);
	}

}
