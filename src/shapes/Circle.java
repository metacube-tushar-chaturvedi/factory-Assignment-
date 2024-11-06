package shapes;

import java.util.Date;

import helper.Point;

public class Circle implements Shape {
    private final Point center;
    private final double radius;
    private final Date timestamp;

    public Circle(Point point, double radius) {
        this.center= point;
        this.radius = radius;
        timestamp = new Date();
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return (2* 3.14 * radius);
    }

    @Override
    public Point getOrigin() {
        return center;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.CIRCLE;
    }

    @Override
    public Date getTimeStamp() {
        return timestamp;
    }

    @Override
    public boolean isEnClosed(Point point){
        double dx = point.getX();
        double dy = point.getY();
        double distance  = dx*dx + dy*dy;
        double radiusSquared = radius*radius;

        return distance<=radiusSquared;
    }

}
