package hw6.task1;

public class DivOperation extends SumOperation {
    private double result;

    /**
     *
     * @param number1 Первое число
     * @param number2 Второе число
     * @return возвращает разницу от деления первого числа на второе
     */
    @Override
    public double Operation(double number1, double number2) {
        if (number2 != 0) {
            return result = number1 / number2;
        } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
    }

    @Override
    public double getResult() {
        return result;
    }
}
