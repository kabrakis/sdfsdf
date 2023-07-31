package hw5.task1;

public class CalculatorModel {
    private int result;

    public int sum(int number1, int number2) {
        return result = number1 + number2;
    }

    public int div(int value1, int value2) {
        if (value2 != 0) {
            return result = value1 / value2;
        } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
    }

    public int mul(int value1, int value2) {
        return result = value1 * value2;
    }

    public int sub(int value1, int value2) {
        return result = value1 - value2;
    }

    public int getResult() {
        return result;
    }
}
