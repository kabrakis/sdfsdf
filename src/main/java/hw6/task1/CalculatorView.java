package hw6.task1;

import java.util.Scanner;



public class CalculatorView {

    Scanner in = new Scanner(System.in);
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    public char chooseOperation() {
        System.out.println("Введите операцию (+, -, /, *, p(pow), s(sqrt): ");
        return in.next().charAt(0);
    }
    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число/степень: ");
        int input = scanner.nextInt();
        return input;
    }
}