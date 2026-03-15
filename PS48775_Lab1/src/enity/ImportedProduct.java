package enity;

public class ImportedProduct extends Product{
	private double importTaxRate;
	private double shippingFee;
	
	public ImportedProduct() {
	}
	
	public ImportedProduct(String id, String name, double basePrice, double importTaxRate, double shippingFee) {
		super(id, name, basePrice);
		this.setImportTaxRate(importTaxRate);
		this.setShippingFee(shippingFee);
	}
	
	public double getImportTaxRate() {
		return importTaxRate;
	}
	public void setImportTaxRate(double importTaxRate) {
		if (importTaxRate >= 0 && importTaxRate <= 1) {
			this.importTaxRate = importTaxRate;
		} else {
			this.importTaxRate = 0;
		}
	}
	public double getShippingFee() {
		return shippingFee;
	}
	public void setShippingFee(double shippingFee) {
		if (shippingFee >= 0) {
			this.shippingFee = shippingFee;
		} else {
			this.shippingFee = 0;
		}
}
	
	@Override
	public double finalPrice() {
		return super.finalPrice() + (super.finalPrice() * this.importTaxRate) + this.shippingFee;
	}

	@Override
	public String toString() {
		return super.toString() + " [importTaxRate=" + importTaxRate + ", shippingFee=" + shippingFee +  "]";
	}
}
