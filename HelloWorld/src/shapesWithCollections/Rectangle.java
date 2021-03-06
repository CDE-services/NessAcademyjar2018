package shapesWithCollections;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int width, int height, int x, int y, char color) {
		super(x, y, color);
		this.width = width;
		this.height = height;
	}
	
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void print() {
		super.printOffsetY();
		for(int r = 0; r < width; r++) {
            for(int c = 0; c < height; c++) {
            	super.printOffsetX();
                System.out.print(super.color);
            }
            System.out.println();
        }
	}
}
