package hw4.task1;

public class PrintElement<E> {
    private E element;

    public PrintElement(E element) {

        this.element = element;
    }

    void PrintElement() {
        System.out.println("Наш элемент: " + element);
    }
}
