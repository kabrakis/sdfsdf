package Seminar6.task2;

abstract class Shape1 {
    public abstract void draw();
}

class Circle extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class Triangle extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}


