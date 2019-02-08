package projectA;

public class sales {
	public String customerNumber;
	public int sales;

	public sales() {
	}
	
	public sales(String nb, int sales) {
		this.customerNumber = nb;
		this.sales = sales;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}
	
}
