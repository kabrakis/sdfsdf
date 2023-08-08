package hzchto;

import java.util.logging.Level;
import java.util.logging.Logger;
public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart; this.imaginaryPart = imaginaryPart;
    }
    public double getRealPart() {
        return realPart; }
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }
    public double getImaginaryPart() {
        return imaginaryPart;
    }
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
} interface Calculator {
    ComplexNumber add(ComplexNumber number1, ComplexNumber number2);
    ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2);
    ComplexNumber divide(ComplexNumber number1, ComplexNumber number2);
}
class ComplexCalculator implements Calculator {
    private Logger logger;
    public ComplexCalculator() {
        logger = Logger.getLogger(ComplexCalculator.class.getName());
    }
    @Override
    public ComplexNumber add(ComplexNumber number1, ComplexNumber number2) {
        double realPart = number1.getRealPart() + number2.getRealPart();
        double imaginaryPart = number1.getImaginaryPart() + number2.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logger.log(Level.INFO, "Addition result: " + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
        return result;
    }
    @Override
    public ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2) {
        double realPart = number1.getRealPart() * number2.getRealPart() - number1.getImaginaryPart() * number2.getImaginaryPart();
        double imaginaryPart = number1.getRealPart() * number2.getImaginaryPart() + number1.getImaginaryPart() * number2.getRealPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logger.log(Level.INFO, "Multiplication result: " + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
        return result;
    }
    @Override
    public ComplexNumber divide(ComplexNumber number1, ComplexNumber number2) {
        double denominator = number2.getRealPart() * number2.getRealPart() + number2.getImaginaryPart() * number2.getImaginaryPart();
        double realPart = (number1.getRealPart() * number2.getRealPart() + number1.getImaginaryPart() * number2.getImaginaryPart()) / denominator;
        double imaginaryPart = (number1.getImaginaryPart() * number2.getRealPart() - number1.getRealPart() * number2.getImaginaryPart()) / denominator;
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logger.log(Level.INFO, "Division result: " + result.getRealPart() + " + " + result.getImaginaryPart() + "i"); return result;
    }
}
