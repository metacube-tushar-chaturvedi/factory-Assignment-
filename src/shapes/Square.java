package shapes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import helper.Point;

public class Square implements Shape{
    private final Point origin;
    private final double side;
    private final Date timestamp;
    private final List<Point>pointList;

    public Square(Point point, double side) {
        this.origin = point;
        this.side = side;
        timestamp = new Date();
        this.pointList = calculateVertex();
    }

    List<Point> calculateVertex(){
        int noOfSides = 4;
        List<Point> vertex = new ArrayList<>();
        vertex.add(origin);

    double angleIncrement = 2 * 3.14 / noOfSides;
    double currentAngle = 0;

    for (int i = 1; i < noOfSides; ++i) {
        currentAngle += angleIncrement;
        // double angleDegrees = currentAngle;   
        // double angleRadians = Math.toRadians(angleDegrees);
        Point nextVertex =new  Point(0,0);
        nextVertex.setX(vertex.get(i-1).getX() + side * Math.cos(currentAngle));
        nextVertex.setY( vertex.get(i-1).getY() + side * Math.sin(currentAngle));
        vertex.add(nextVertex);
    }

    return vertex;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public Point getOrigin() {
        return origin;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.SQUARE;
    }

    @Override
    public Date getTimeStamp() {
        return timestamp;
    }
    

    public List<Point> corner(){
        return pointList;
    }

    @Override
    public boolean isEnClosed(Point point){
        Point.checkPoint(point,pointList);

        return Point.checkPoint(point,pointList);
    }
}
