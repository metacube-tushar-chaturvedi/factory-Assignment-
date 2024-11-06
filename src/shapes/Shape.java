package shapes;

import java.util.Date;
import java.util.List;

import helper.Point;

public interface Shape {

   double getArea();

   double getPerimeter();

   Point getOrigin();

   ShapeType getShapeType();

   Date getTimeStamp();

   boolean isEnClosed(Point point);
}
