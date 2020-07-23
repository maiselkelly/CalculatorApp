package CalculatorApp1;

public class Adder extends CalculateBase {
        double sum;


    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        setResult(leftVal + rightVal);

    }

}
