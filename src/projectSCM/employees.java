package projectSCM;

public class employees {
	private sales sale;
	public String empNumber;
	public String emptName;
	public int salary;

	
	public employees() {
		
	}
	
	public employees(String nb, String n, int s) {
		this.empNumber = nb;
		this.emptName = n;
		this.salary = s;
	}


	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmptName() {
		return emptName;
	}

	public void setEmptName(String emptName) {
		this.emptName = emptName;
	}

	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

	public sales getSale() {
		return sale;
	}

	public void setSale(sales sale) {
		this.sale = sale;
	}

	
}