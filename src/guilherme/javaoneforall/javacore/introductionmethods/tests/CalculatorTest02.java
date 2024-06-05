package guilherme.javaoneforall.javacore.introductionmethods.tests;

import guilherme.javaoneforall.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] numbers = {1,2,3,4,5};

        calculator.sumArray(numbers);
        System.out.println("---------------");
        System.out.println("Type the numbers that you want sum");
        calculator.sumVarArgs();
    }

}
