package hw5.task1;

import java.util.Scanner;

import static java.lang.System.in;

public class CalculatorView {
    Scanner in = new Scanner(System.in);
    public void displayResult(int result) {
        System.out.println("Результат: " + result);
    }

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = scanner.nextInt();
        return input;
    }
    public char chooseOperation() {
        System.out.println("Введите операцию (+, -, /, *): ");
        return in.next().charAt(0);
    }
}