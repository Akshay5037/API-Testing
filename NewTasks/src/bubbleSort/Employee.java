package bubbleSort;

public class Employee {
	int eno,salary;
	
	public Employee(int eno,int salary) {
		super();
		this.eno=eno;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + "]";
	}
	

}
