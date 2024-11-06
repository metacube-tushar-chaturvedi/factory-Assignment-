package helper;

import java.util.List;

public class Point {
    private double xPoint;
    private double yPoint;

    public Point(double x,double y){
        this.xPoint = x;
        this.yPoint = y;
    }
    
    public void setX(double x){
        xPoint = x;
    }

    public void setY(double y){
        yPoint = y;
    }

    // getter of x point
    public double getX(){
        return xPoint;  
    }


    
    // getter of y point
    public double getY(){
        return yPoint;  
    }

    public static boolean checkPoint(Point targetPoint, List<Point> polygonPoints) {
        int crossings = 0;
        int numPoints = polygonPoints.size();

        for (int i = 0; i < numPoints; i++) {
            Point p1 = polygonPoints.get(i);
            Point p2 = polygonPoints.get((i + 1) % numPoints);

            if (((p1.getY() > targetPoint.getY()) != (p2.getY() > targetPoint.getY()))) {
                double atX = (p2.getX() - p1.getX()) * (targetPoint.getY() - p1.getY())
                        / (p2.getY() - p1.getY()) + p1.getX();
                if (targetPoint.getX() < atX) {
                    crossings++;
                }
            }
        }
        return (crossings % 2 != 0);
    }
}
