package Seminar7.task2;

public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new ShapeFactory.CircleFactory();
        ShapeFactory squareFactory = new ShapeFactory.SquareFactory();

        Shape circle = circleFactory.createShape();
        Shape square = squareFactory.createShape();

        circle.draw(); // Выведет: Drawing a circle
        square.draw(); // Выведет: Drawing a square
    }
}

