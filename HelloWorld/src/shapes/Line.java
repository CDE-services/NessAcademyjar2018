package shapes;

public class Line extends Shape {
	private int length;
	
	public Line(int length) {
		super();
		this.length = length;
	}
	
	public Line(int length, int x, int y, char color) {
		super(x, y, color);
		this.length = length;
	}



	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public void print() {
		printOffsetY();
		for (int i = 0; i < length; i++) {
			printOffsetX();
			System.out.print(super.color);
		}
		System.out.println();
	}
}
