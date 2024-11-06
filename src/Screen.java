import java.util.ArrayList;
import java.util.List;

import helper.Point;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.ShapeType;
import shapes.Square;
import shapes.Triangle;

public class Screen {
    private List<Shape> shapeList;
    
    public Screen(){
        shapeList = new ArrayList();
    }

    public void addShape(Shape shape){
        shapeList.add(shape);
    }

    public void removeShape(Shape shape){
        shapeList.remove(shape);
    }

    public void deleteAll(ShapeType shapeType){
        for (Shape shape : shapeList) {
             if(shape.getShapeType()==shapeType){
                shapeList.remove(shape);
             }

        }
    }

    public List<Shape>sortShape(){
		List<Shape> sortedShapesList = shapeList;
		for(int i =0; i<shapeList.size()-1;i++){
			for(int j=i+1;j<shapeList.size();j++){

				if(shapeList.get(i).getArea()>shapeList.get(j).getArea()){
					Shape tempObj = shapeList.get(j);
					shapeList.set(j,shapeList.get(i));
					shapeList.set(i,tempObj);

				}
			}
		
		}
		return sortedShapesList;	
    }

	public void display(){
		for(Shape shape: shapeList ){
			System.out.println(shape.getShapeType());
			System.out.println(shape.getArea());
			System.out.println(shape.getPerimeter());
			System.out.println("");

		}
	}

	public static void main(String []arg){
		Point point = new Point(0, 0); 
		Shape rectangle = new Rectangle(point, 10, 20);
		Shape circleShape = new Circle(point,10);
		Shape squSahpe = new Square(point,20);
		Shape triangleShape = new Triangle(point, 10);

		Screen screen = new Screen();

		screen.addShape(rectangle);
		screen.addShape(circleShape);
		screen.addShape(squSahpe);
		screen.addShape(triangleShape);   
        screen.sortShape();

	}

}
