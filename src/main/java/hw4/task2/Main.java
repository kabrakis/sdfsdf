package hw4.task2;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        String c = "One";
        String d = "Two";

        PrintArray<Integer> listInt = new PrintArray<>();
        listInt.AddList(a);
        listInt.AddList(b);

        PrintArray<String> listStr = new PrintArray<>();
        listStr.AddList(c);
        listStr.AddList(d);

        listInt.PrintArray();

        System.out.println();

        listStr.PrintArray();

    }
}
