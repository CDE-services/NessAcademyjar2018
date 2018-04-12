package doors;

public class Student extends Person {
	private String school;

	public Student(String name, int age, String school) throws AgeValidationException  {
		super(name, age);
		this.school = school;
	}
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	@Override
	public void setAge(int age) throws MoreConcreteException {
		try {
			super.setAge(age);
		} catch (AgeValidationException e) {
			throw new MoreConcreteException(e.getMessage());
		}
	}

	@Override
	public String toString() {
		return "Student [school=" + school + "] " + super.toString();
	}
}
