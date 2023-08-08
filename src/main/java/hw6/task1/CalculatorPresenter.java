package hw6.task1;

public class CalculatorPresenter extends SumOperation {

    private CalculatorView view;
    private SqrOperation sqrOperation;


    public CalculatorPresenter(CalculatorView view, SqrOperation sqrOperation) {

        this.view = view;
        this.sqrOperation = sqrOperation;

    }

    public void onAddButtonClicked()  {

        char ch = view.chooseOperation();
        double number1 = view.getUserInput();
        double number2 = view.getUserInput();
        double res = 0;
        SumOperation sum = new SumOperation();
        DivOperation div = new DivOperation();
        PowOperation pow = new PowOperation();
        MulOperation mul = new MulOperation();
        SubOperation sub = new SubOperation();
        CalculatorModel sqrt = new CalculatorModel();
        switch (ch) {
            case '+':
                sum.Operation(number1,number2);
                res = sum.getResult();
                break;

            case '-':
                sub.Operation(number1,number2);
                res = sub.getResult();
                break;

            case '*':
                mul.Operation(number1,number2);
                res = mul.getResult();
                break;
            case '/':
                div.Operation(number1,number2);
                res = div.getResult();
                break;

            case 'p':
                pow.Operation(number1,number2);
                res = pow.getResult();
                break;
            case 's':
                sqrOperation.sqr(number1);
                res = sqrOperation.getResult();
                break;

            default:
                System.out.println("Введена неверная операция");
                break;

        }
        view.displayResult(res);
    }

}

