package shapes;

public class PaintBrush {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes [0] = new Line(10, 2, 4, 'B');
		shapes [1] = new Square(5, 1, 3, 'O');
		shapes [2] = new Rectangle(8, 4);
		
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].print();
		}
		
		System.out.println(">>>>");
		
//		for(Line l : lines) {
//			l.print();
//		}
	}

}
