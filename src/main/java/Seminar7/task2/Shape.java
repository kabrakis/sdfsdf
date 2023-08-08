package Seminar7.task2;

 abstract class Shape {
    public abstract void draw();
}
 class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

 class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
