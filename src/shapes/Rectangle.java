package shapes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import helper.Point;

public class Rectangle implements Shape {
    private final Point origin;
    private final double length;
    private final double width;
    private final Date timestamp;
    private final List<Point>pointList;

    public Rectangle(Point point, double length, double width) {
        this.origin = point;
        this.length = length;
        this.width = width;
        timestamp = new Date();
        this.pointList = calculateVertex(origin,length,width);
        
    }

    List<Point> calculateVertex(Point origin, double length, double width) {
        List<Point> corners = new ArrayList<>();
        corners.add(origin);
        corners.add(new Point(origin.getX() + length, origin.getY()));
        corners.add(new Point(origin.getX() + length, origin.getY() + width));
        corners.add(new Point(origin.getX(), origin.getY() + width));
        return corners;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public Point getOrigin() {
        return origin;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.RECTANGLE;
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
