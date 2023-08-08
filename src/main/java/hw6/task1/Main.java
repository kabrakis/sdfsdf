package hw6.task1;

public class Main {
    public static void main(String[] args) {
// Создание экземпляров модели, представления и презентера

        CalculatorView view = new CalculatorView();
        // создал новый объект sqrOperation для того чтобы, передать его в объект presenter
        SqrOperation sqrOperation = new SqrOperation();
        CalculatorPresenter presenter = new CalculatorPresenter(view,sqrOperation);

// Обработка действия пользователя (например, нажатие кнопки "Сложить")
        presenter.onAddButtonClicked();
    }
}