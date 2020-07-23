package CalculatorApp2;

public class Calculator2Source {
    public static void main(String[] args) {

        String[] mathArray = {"divide 100.0 50.0", "add 25.0 92.0",
                "subtract 225.0 17.0", "multiply 11.0 3.0"};


            MathProcessing[] handler = {
                new Divider(),
                new Adder(),
                new Subtractor(),
                new Multiplier()};

        DynamicHelper mathLoop = new DynamicHelper(handler);


        for (int i = 0; i < mathArray.length; i++) {
            System.out.println(mathLoop.process(mathArray[i]));

        }
    }

}