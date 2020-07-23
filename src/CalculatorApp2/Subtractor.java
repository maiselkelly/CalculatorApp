package CalculatorApp2;

public class Subtractor extends CalculateBase implements MathProcessing {

    public Subtractor(){

    }

    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public void calculate() {
        result = leftVal - rightVal;
    }

    @Override
    public String getKeyword() {
        return "subtract";
    }

    @Override
    public char getSymbol() {
        return '-';
    }


    @Override
    public double doCalculation(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        calculate();
        return result;

    }


}