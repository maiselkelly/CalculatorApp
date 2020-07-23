package CalculatorApp2;

public class DynamicHelper {

    MathProcessing[] handlers;


    public DynamicHelper(MathProcessing[] handlers) {
        this.handlers =handlers;
    }

    public String process(String input) {
        String[] parts = input.split(MathProcessing.SEPARATOR);
        String command = parts[0];
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);
        String result = null;

        for (MathProcessing mathProcessing : handlers) {
            if (mathProcessing.getKeyword().equals(command)) {
                result = parts[1] + " " + mathProcessing.getSymbol() + " " + parts[2] + " = " +
                        mathProcessing.doCalculation(leftVal, rightVal);

            }
        }
            return result;
    }

}