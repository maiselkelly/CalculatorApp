package CalculatorApp2;

public interface MathProcessing {

    String SEPARATOR = " ";

    public String getKeyword();

    char getSymbol();

    double doCalculation(double leftVal, double rightVal);

    }
