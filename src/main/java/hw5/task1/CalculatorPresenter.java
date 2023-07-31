package hw5.task1;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();
        char ch = view.chooseOperation();
        int res = 0;
        switch (ch) {
            case '+':
                model.sum(number1, number2);
                res = model.getResult();
                break;

            case '-':
                model.sub(number1, number2);
                res = model.getResult();
                break;

            case '*':
                model.mul(number1, number2);
                res = model.getResult();
                break;
            case '/':
                model.div(number1, number2);
                res = model.getResult();
                break;
            default:
                System.out.println("Введена неверная операция");
                break;

        }
        view.displayResult(res);
    }
}
