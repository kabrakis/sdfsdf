package Seminar7.task2;

public interface ShapeFactory {
    Shape createShape();

    public class CircleFactory implements ShapeFactory {
        @Override
        public Shape createShape() {
            return new Circle();
        }
    }


    public class SquareFactory implements ShapeFactory {
        @Override
        public Shape createShape() {
            return new Square();
        }
    }
}
