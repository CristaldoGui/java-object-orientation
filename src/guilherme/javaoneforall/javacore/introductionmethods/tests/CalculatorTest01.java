package guilherme.javaoneforall.javacore.introductionmethods.tests;

import guilherme.javaoneforall.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers();
        System.out.println("------");
        calculator.subtractTwoNumbers();
        System.out.println("------");
        calculator.multiplyTwoNumbers(2, 2);
        System.out.println("------");
        System.out.println(calculator.divideTwoNumbers(20, 5));

    }
}
