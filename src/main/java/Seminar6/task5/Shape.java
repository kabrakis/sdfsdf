//package Seminar6.task5;
//
//public interface Shape {
//    double getArea();
//    double getPerimeter();
//}
//
//public class Rectangle implements Shape {
//    private double width;
//    private double height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//        return width * height;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * (width + height);
//    }
//}
//
//public class Square implements Shape {
//    private double side;
//
//    public Square(double side) {
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        return side * side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * side;
//    }
//}
//
//public class Circle implements Shape {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//}
