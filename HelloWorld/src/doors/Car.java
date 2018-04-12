package doors;

public class Car {
	public static String DEFAULT_FUEL = "gasoline";
	private String brand;
	private String fuel;

	public Car(String brand, String fuel) {
		this.brand = brand;
		this.fuel = fuel;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", fuel=" + fuel + "]";
	}
}
