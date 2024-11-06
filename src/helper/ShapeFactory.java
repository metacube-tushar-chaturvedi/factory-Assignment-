package helper;

import java.util.List;

import shapes.Circle;
import shapes.Polygen;
import shapes.Rectangle;
import shapes.Shape;
import shapes.ShapeType;
import shapes.Square;
import shapes.Triangle;

public class ShapeFactory {
    public static Shape createShape(Point point,ShapeType type,List<Integer> sides){
        Shape newShape = null ;
        if(type==ShapeType.RECTANGLE){
            double length = sides.get(0);
            double width = sides.get(1);
            newShape = new Rectangle(point,length,width);
        }

        else if(type==ShapeType.SQUARE){
            double side = sides.get(0);
            newShape = new Square(point, side);
        }

        else if(type==ShapeType.TRIANGLE){
            double side = sides.get(0);
            newShape = new Triangle(point, side);
        }

        else if(type==ShapeType.CIRCLE){
            double side = sides.get(0);
            newShape = new Circle(point, side);
        }

        else if(type==ShapeType.POLYGON){
            double numSides = sides.get(0);
            double length = sides.get(1);
            newShape = new Polygen(point,length,numSides);
        }


        return newShape;
    } 

}
