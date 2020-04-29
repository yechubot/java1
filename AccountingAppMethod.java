
public class AccountingAppMethod {
	public static double valueOfSupply = 10000;
	public static double vatRate = 0.1;

	public static void main(String[] args) {
		
		System.out.println("Value of Supply : " +valueOfSupply);
		System.out.println("VAT : " +getVat());
		System.out.println("Total : " + getTotal());
		
	}

	public static double getVat() {
		return valueOfSupply*vatRate;
	}
	public static double getTotal() {
		return valueOfSupply +getVat();
	}

}