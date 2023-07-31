package Seminar6.task3;

class Rectangle2 {
    protected int width;
    protected int height;

    public Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square {
    private Rectangle2 rectangle1;

    public Square(int size) {
        this.rectangle1 = new Rectangle2(size, size);
    }

    public void setSize(int size) {
        rectangle1.setWidth(size);
        rectangle1.setHeight(size);
    }

    public int getArea() {
        return rectangle1.getArea();
    }
}
