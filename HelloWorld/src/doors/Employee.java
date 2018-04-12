package doors;

/**
 * Trieda reprezentujuca zamestnanca.
 * @author Miska
 */
public class Employee extends Person {

	/**
	 * Plat zamestnanca
	 */
	private int salary;
	/**
	 * Auto zamestnanca
	 */
	private Car car;
	
	/**
	 * Konstruktor pre zamestnanca.
	 * @param name meno zamestnanca
	 * @param age vek zamestnanca
	 * @param salary plat zamestnanca
	 */
	public Employee(String name, int age, int salary) throws AgeValidationException {
		super(name, age);
		this.salary = salary;
	}
	
	/**
	 * Ziska plat zamestnanca
	 * @return plat <b>zamestnanca</b> 
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * Nastavi plat zamestnanca
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public Car getCar() {
		return car;
	}

	@Override
	public String toString() {
		String s = "Employee [salary=" + salary + "]" + super.toString();
		
		if(this.car != null) {
			s = s + ", " + car;
		}
		
		return s;
	}
}
