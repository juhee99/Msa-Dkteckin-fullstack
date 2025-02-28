package day9.emp;

public abstract class Employee {
	private String name;
	private int number;
	private String department;
	private int salary;
	
	public Employee(){}
	
	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		setSalary(salary);
	}
	
	public abstract double tax();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary < 0) this.salary = 0;
		this.salary = salary;
	}
	
}
