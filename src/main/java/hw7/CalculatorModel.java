package hw7;

public class CalculatorModel {
    private ComplexOperation operation;

    public CalculatorModel() {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return operation.operate(num1, num2);
    }
}

