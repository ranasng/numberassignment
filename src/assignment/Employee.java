package assignment;

public class Employee implements Comparable<Employee> {
	private int id;
	private String empName;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.age > o.getAge()) {
			return 1;
		} else if (this.age < o.getAge()) {
			return -1;
		} else if (this.age == o.getAge()) {
			if (this.id > o.getId()) {
				return 1;
			} else if (this.id < o.getId()) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}

	}

	public Employee(int id, String empName, int age) {
		super();
		this.id = id;
		this.empName = empName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", age=" + age + "]";
	}

}
