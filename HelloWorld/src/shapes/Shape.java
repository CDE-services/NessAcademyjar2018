package shapes;

public abstract class Shape {
	protected int x;
	protected int y;
	protected char color;

	public Shape() {
		this.x = 0;
		this.y = 0;
		this.color = '*';
	}
	
	public Shape(int x, int y, char color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public abstract void print();
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}
	
	protected void printOffsetX() {
		for (int i = 0; i < x; i++) {
			System.out.print(" ");
		}
	}
	
	protected void printOffsetY() {
		for (int i = 0; i < y; i++) {
			System.out.println();
		}
	}
}
