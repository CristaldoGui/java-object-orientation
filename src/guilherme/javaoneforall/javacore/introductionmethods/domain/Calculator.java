package guilherme.javaoneforall.javacore.introductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int a, int b) {
        System.out.println(a * b);
    }

    public double divideTwoNumbers(double a, double b) {
        return b > 0 ? a / b : 0;
    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        System.out.printf("Sum: %d", sum);
    }

    public void sumVarArgs(int... numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        System.out.printf("Sum: %d", sum);
    }
}
