package hw7;


public class CalculatorPresenter extends CalculatorModel {

    private hw7.CalculatorView view;

    public CalculatorPresenter(CalculatorView view) {
        this.view = view;
    }

    public void onAddButtonClicked() {

        System.out.println("Ввод первого комплексного числа: ");
        double realPartNum1 = view.getUserInputRealPart();
        double imaginPartNum1 = view.getUserInputImaginPart();

        System.out.println("Ввод второго комплексного числа: ");
        double realPartNum2 = view.getUserInputRealPart();
        double imaginPartNum2 = view.getUserInputImaginPart();


        ComplexNumber complexNumber1 = new ComplexNumber(realPartNum1, imaginPartNum1);
        ComplexNumber complexNumber2 = new ComplexNumber(realPartNum2, imaginPartNum2);

        char ch = view.chooseOperation();

        ComplexNumber resComplexNumber = new ComplexNumber(0, 0);

        double realPart = 0;
        double imaginPart = 0;

        switch (ch) {

            case '-':
                resComplexNumber = complexNumber1.subtract(complexNumber2);
                realPart = resComplexNumber.getReal();
                imaginPart = resComplexNumber.getImaginary();
                break;
            case '+':
                resComplexNumber = complexNumber1.sum(complexNumber2);
                realPart = resComplexNumber.getReal();
                imaginPart = resComplexNumber.getImaginary();
                break;

            case '*':
                resComplexNumber = complexNumber1.multiply(complexNumber2);
                realPart = resComplexNumber.getReal();
                imaginPart = resComplexNumber.getImaginary();
                break;
            case '/':
                resComplexNumber = complexNumber1.divide(complexNumber2);
                realPart = resComplexNumber.getReal();
                imaginPart = resComplexNumber.getImaginary();
                break;
            default:
                System.out.println("Введена неверная операция");
                break;
        }
        view.displayResult(realPart, imaginPart);
    }
}
