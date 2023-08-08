package hw6.task1;

public class CalculatorModel {
    private double result;

   public double sum(double number1, double number2) {
       return result = number1 + number2;
    }

    public double div(double value1, double value2) {
       if (value2 != 0) {
            return result = value1 / value2;
       } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
       }
    }

    public double mul(double value1, double value2) {
        return result = value1 * value2;
    }

    public double sub(double value1, double value2) {
        return result = value1 - value2;
    }

    public double getResult() {
        return result;
    }
}
