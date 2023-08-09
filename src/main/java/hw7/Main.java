package hw7;

public class Main {
    public static void main(String[] args) {
        // создание экземпляра CalculatorView
        CalculatorView view = new CalculatorView();

        CalculatorPresenter presenter = new CalculatorPresenter(view);
        // Обработка действия пользователя
        presenter.onAddButtonClicked();
    }
}
