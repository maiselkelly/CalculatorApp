package CalculatorApp1;

public class Multiplier extends CalculateBase {
    double product;


    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        setResult(leftVal * rightVal);
    }

}