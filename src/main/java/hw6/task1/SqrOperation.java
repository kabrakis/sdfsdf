package hw6.task1;

/**
 * SqrOperation является наследником CalculatorModel для расширения функционала калькулятора
 * выполняется принцип OCP
 */
public class SqrOperation extends CalculatorModel {
   private double result;

    /**
     *
     * @param number1 здесь только ОДНО число
     * @return возвращает корень квадратный из числа
     */
    public double sqr(double number1){
        return result = Math.sqrt(number1);
    }
    @Override
    public double getResult() {
        return result;
    }
}

