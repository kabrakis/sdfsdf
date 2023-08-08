package hw6.task1;

/**
 * SumOperation является основным классом для всего функционала калькулятора,
 * от него наследуются все функции калькулятора. Такие, как: "SubOperation","PowOperation",
 * "MulOperation","DivOperation" и этот список можно расширять дальше. Соблюдается принцип LSP.
 */
 class SumOperation  {

    private double result;

     /**
      *
      * @param number1 Первое число
      * @param number2 Второе число
      * @return возвращает результат суммы первого числа и второго
      */
     public double Operation(double number1, double number2) {
        return result = number1 + number2;
     }

     public double getResult() {
         return result;
     }
 }
