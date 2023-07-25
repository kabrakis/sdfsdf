package seminar004.task2;

public class NumericDemo {
    public static void main(String[] args) {
        Numeric<Integer> iOb = new Numeric<>(5);
        System.out.println("Обратная величина " + iOb.reciprocal());
        System.out.println("Дробная часть iOb " + iOb.fract());
        System.out.println(" ");

        Numeric<Double> dOb = new Numeric<>(5.25);
        System.out.println("Обратная величина " + dOb.reciprocal());
        System.out.println("Дробная часть iOb " + dOb.fract());

//        Numeric<String> sOb = new Numeric<>("5");
    }
}
