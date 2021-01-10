package com.Goltsov.Inheritance;
/*
Define an abstract class Shape with an instance variable of class Point, a
constructor, a concrete method public void moveBy(double dx, double dy) that
moves the point by the given amount, and an abstract method public Point
getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
double height), and public Line(Point from, Point to).
 */
public class task4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(0, 3), 6, 3);
        System.out.println(rectangle.getCenter());

        Line line = new Line(new Point(0,0), new Point(3,3));
        System.out.println(line.getCenter());

    }
}
class Circle extends Shape implements Cloneable{
    private double radius;

    public Circle(Point center, double radius)  {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return this.point;
    }
    protected Circle clone() throws CloneNotSupportedException {
        try {
            Circle clone = (Circle) super.clone();
            clone.point = new Point(point.getX(), point.getY());
            return clone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
class Rectangle extends Shape implements Cloneable{
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width,
                     double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
//        this.moveBy(width/2, -height/2);
//        return this.point;
        return new Point(this.point.x + width/2, this.point.y - height/2);
    }

    protected Rectangle clone() throws CloneNotSupportedException {
        try {
            Rectangle clone = (Rectangle) super.clone();
            clone.point = new Point(point.getX(), point.getY());
            return clone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
class Line extends Shape implements Cloneable{
    Point to;
    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((to.x - this.point.x)/2,
                        (to.y - this.point.y)/2);
    }

    protected Line clone() throws CloneNotSupportedException {
        try {
            Line clone = (Line) super.clone();
            clone.point = new Point(point.getX(), point.getY());
            clone.to = new Point(to.getX(), to.getY());
            return clone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
