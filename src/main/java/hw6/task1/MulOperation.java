package hw6.task1;

public class MulOperation extends SumOperation {
    private double result;

    /**
     *
     * @param number1 Первое число
     * @param number2 Второе число
     * @return возвращает результат умножения первого числа на второе
     */

    @Override
    public double Operation(double number1, double number2) {
        return result = number1 * number2;
    }

    @Override
    public double getResult() {
        return result;
    }
}
