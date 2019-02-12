package course;

public class Employee {
	
	private int id;
	private String name;
	private double salary;

	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double percentage) {
		double aux = (percentage/100) * salary;
		salary +=  aux;
	}
	
	public String toString() {
		return "Employee: " +
				"\n" 
				+ "Id: "+
				id +
				"\n" +
				"name: " +
				name +
				"\n"+
				"Salary: " +
				String.format("%.2f",salary) 
				+ "\n";
				
	}
}
