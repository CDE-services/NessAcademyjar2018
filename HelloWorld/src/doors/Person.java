package doors;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) throws AgeValidationException {
		this.name = name;
		setAge(age);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws AgeValidationException {
		if(this.isValidAge(age)) {
			this.age = age;
		} else {
			throw new AgeValidationException(
					"Neplatny vek,"
					+ "musi byt medzi 0 az 150");
		}
	}
	
	private boolean isValidAge(int ageNew) {
		return ageNew >= 0 && ageNew <= 150;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
