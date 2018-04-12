package shapesWithCollections;

public class Square extends Shape {
	private int size;
	
	public Square(int size) {
		super();
		this.size = size;
	}
	
	public Square(int size, int x, int y, char color) {
		super(x, y, color);
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void print() {
		super.printOffsetY();
		for(int r = 0; r < size; r++) {
            for(int c = 0; c < size; c++) {
            	super.printOffsetX();
                System.out.print(super.color);
            }
            System.out.println();
        }
	}
}
