package CalculatorApp2;

public class Divider extends CalculateBase implements MathProcessing {

    public Divider(){

    }

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public void calculate() {
        result = leftVal / rightVal;
    }

    @Override
    public String getKeyword() {
        return "divide";
    }

    @Override
    public char getSymbol() {
        return '/';
    }


    @Override
    public double doCalculation(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        calculate();
        return result;

    }

}