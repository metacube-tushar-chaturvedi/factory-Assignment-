package shapes;

import java.util.Date;

import helper.Point;

public interface Shape {
   // get Area
   double getArea();

   //get Perameter
   double getPerimeter();

   //get origin
   Point getOrigin();

   // get Shape type
   ShapeType getShapeType();

   // get timeStamp
   Date getTimeStamp();
    
   // check point inside shape
   boolean isEnClosed(Point point);
}
