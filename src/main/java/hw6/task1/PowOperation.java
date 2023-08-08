package hw6.task1;


public class PowOperation extends SumOperation{
   private double result;

    /**
     *
     * @param number1 Первое число
     * @param number2 Второе число
     * @return возвращает первое число возведенное в степень второго
     */

    public double Operation(double number1, double number2){
        return result =  Math.pow(number1,number2);
    }
    @Override
    public double getResult() {
        return result;
    }
}
