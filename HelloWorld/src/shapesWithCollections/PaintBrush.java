package shapesWithCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaintBrush {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Line(10, 2, 4, 'B'));
		shapes.add(new Square(5, 1, 3, 'O'));
		shapes.add(new Rectangle(8, 4));
		shapes.add(new Line(4, 0, 0, '%'));
		
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).print();
		}
		
		//Vypis pred sortom
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
		
		//riesenie cez Comparator
		Collections.sort(shapes, new Comparator<Shape>() {

			@Override
			public int compare(Shape s1, Shape s2) {
				if(s1 == null) return -1;
				if(s2 == null) return 1;
				return s1.compareTo(s2);
			}
		});
		
		//riesenie cez Comparable
		Collections.sort(shapes);
		
		//Vypis po sorte
		System.out.println();
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}

}
