package hw4.task1;

public class Main {
    public static void main(String[] args) {
        PrintElement<String> myOb = new PrintElement<>("Текст");
        myOb.PrintElement();
        PrintElement<Integer> myOb1 = new PrintElement<>(123);
        myOb1.PrintElement();
        PrintElement<Double> myOb2 = new PrintElement<>(4.789);
        myOb2.PrintElement();
    }


}
