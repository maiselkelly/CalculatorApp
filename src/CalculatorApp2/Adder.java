package CalculatorApp2;


public class Adder extends CalculateBase implements MathProcessing {

    public Adder(){

    }

    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public void calculate() {
        result = leftVal + rightVal;
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }


    @Override
    public double doCalculation(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        calculate();
        return result;

    }

}
