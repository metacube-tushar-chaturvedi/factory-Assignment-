import java.util.ArrayList;
import java.util.List;

import helper.Point;
import helper.ShapeFactory;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.ShapeType;
import shapes.Square;
import shapes.Triangle;

public class Screen {
	private List<Shape> shapeList;

	public Screen() {
		shapeList = new ArrayList();
	}

	public void addShape(Shape shape) {
		shapeList.add(shape);
	}

	public void removeShape(Shape shape) {
		shapeList.remove(shape);
	}

	public void deleteAll(ShapeType shapeType) {
		for (Shape shape : shapeList) {
			if (shape.getShapeType() == shapeType) {
				shapeList.remove(shape);
			}

		}
	}

	public List<Shape> sortShape() {
		List<Shape> sortedShapesList = shapeList;
		for (int i = 0; i < shapeList.size() - 1; i++) {
			for (int j = i + 1; j < shapeList.size(); j++) {

				if (shapeList.get(i).getArea() > shapeList.get(j).getArea()) {
					Shape tempObj = shapeList.get(j);
					shapeList.set(j, shapeList.get(i));
					shapeList.set(i, tempObj);
				}
			}

		}
		return sortedShapesList;
	}

	public void display() {
		for (Shape shape : shapeList) {
			System.out.println(shape.getShapeType());
			System.out.println("Area      :" + shape.getArea());
			System.out.println("Perameter : "+shape.getPerimeter());
			Point orgin = shape.getOrigin();

			System.out.println("Origin    : ("+orgin.getX()+","+orgin.getY()+")" );
			System.out.println("timeStamp : "+ shape.getTimeStamp());

			System.out.println("Perameter : "+shape.getPerimeter());

			System.out.println("");

		}
	}

	public static void main(String[] arg) {

		// Square Shape
		Point point = new Point(0, 0);
		List<Integer> sides = new ArrayList<>();
		sides.add(10);
		Shape squareShape = ShapeFactory.createShape(point, ShapeType.SQUARE, sides);

		// Rectangle
		sides.clear();
		sides.add(10);
		sides.add(20);
		Shape rectangleShape = ShapeFactory.createShape(point, ShapeType.RECTANGLE, sides);

		// Triangle shape
		sides.clear();
		sides.add(10);
		Shape triangleShape = ShapeFactory.createShape(point, ShapeType.TRIANGLE, sides);

		// Circle shape
		sides.clear();
		sides.add(10);
		Shape circleShape = ShapeFactory.createShape(point, ShapeType.CIRCLE, sides);

		Screen screen = new Screen();

		screen.addShape(rectangleShape);
		screen.addShape(circleShape);
		screen.addShape(squareShape);
		screen.addShape(triangleShape);
		screen.sortShape();
		screen.display();

		//Sorted 
		System.out.println("Soreted Shapes on the basis on Area");
		List<Shape> sortedShape =  screen.sortShape();
		for (Shape shape : sortedShape) {
			System.out.println(shape.getShapeType());
		}
        
		// Remove 
		screen.removeShape(circleShape);
		System.out.println("After remove circle shape");
		List<Shape> sortedShape1 =  screen.sortShape();
		for (Shape shape : sortedShape1) {
			System.out.println(shape.getShapeType());
		}
        
	}

}
