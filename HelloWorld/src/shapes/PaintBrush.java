package shapes;

public class PaintBrush {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes [0] = new Line(10);
//		shapes [1] = new Triangle(5);
//		shapes [2] = new Rectangle(8);
		
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].print();
		}
		
		System.out.println(">>>>");
		
//		for(Line l : lines) {
//			l.print();
//		}
	}

}