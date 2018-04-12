package doors;

public class Door {
	private boolean open = false;
	
	public void open() {
		System.out.println("Dvere sa otvaraju");
		this.open = true;
	}
	
	public void close() {
		System.out.println("Dvere sa zatvaraju");
		this.open = false;
	}
	
	public boolean isOpen() {
		return open;
	}
}
