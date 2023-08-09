package hw7;

import java.util.Scanner;

public class CalculatorView {
    Scanner in = new Scanner(System.in);

    /**
     * @param realPart   Реальная часть числа
     * @param imaginPart Воображаемая часть числа
     */
    public void displayResult(double realPart, double imaginPart) {
        System.out.println("Реальная часть (Real): " + realPart + " воображаемая часть(Imagin): " + imaginPart);
    }

    public char chooseOperation() {
        System.out.println("Введите операцию (-, +, *, /)");
        return in.next().charAt(0);
    }

    public int getUserInputRealPart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите реальное (Real) число: ");
        int input = scanner.nextInt();
        return input;
    }

    public int getUserInputImaginPart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выдуманное (Imagin) число: ");
        int input = scanner.nextInt();
        return input;
    }
}
