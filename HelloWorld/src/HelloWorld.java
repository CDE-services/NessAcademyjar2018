import doors.*;

public class HelloWorld {
	public static void main(String[] args) {
		testObjects();
	}
	
	private static void testObjects() {
//		System.out.println("Hello world!");
//		System.err.println("Jahodka");
		
//		Employee e = new Employee("Superman", 1500, 50000);
//		System.out.println(e);
//		
//		Student s = new Student("Peter", 15, "Gymnazium Postova");
//		System.out.println(s);
		
//		Car c = new Car("Renault", "gasoline");
//		System.out.println(c);
//		c.DEFAULT_FUEL;
//		Car.DEFAULT_FUEL
		
//		e.setCar(c);
//		System.out.println(e);
//		c.setBrand("Mercedes");
//		System.out.println(e);
		
//		System.out.println(e instanceof Object);
//		System.out.println(e instanceof Person);
//		System.out.println(e instanceof Employee);
		
//		Door d = new Door();
//		
//		d.open();
//		d.close();
//		
//		System.out.println(
//			"Door is open? " + d.isOpen());
		
		Person p;
		try {
			p = new Person("Janko Hrasko", 40);
			
			p.setAge(300);
			
		} catch (AgeValidationException e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	private static void skuska() {
		int a = Integer.MAX_VALUE;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		long l = Long.MAX_VALUE;
		System.out.println(l);
		l = 3L;
		long l2 = a;
		int i = (int) l;
		
//		Person p = new Employee("Janko", 56, 1500);
//		Employee e = (Employee) p;
		
		i = 65;
		char c = (char) i;
		System.out.println(c);
		int j = c;
		System.out.println(j);
//		
//		double d = Double.MAX_VALUE;
//		System.out.println(d);
//		
//		char c = 'a';
//		System.out.println(c);
		
	}
}
