package hw7;

public interface ComplexOperation {
    ComplexNumber operate(ComplexNumber num1, ComplexNumber num2);
}

class ComplexAddition implements ComplexOperation {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        return num1.sum(num2);
    }
}

class ComplexSubtraction implements ComplexOperation {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        return num1.subtract(num2);
    }
}

class ComplexDivides implements ComplexOperation {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        return num1.divide(num2);
    }
}
class ComplexMultiply implements ComplexOperation {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        return num1.multiply(num2);
    }
}
