package guilherme.javaoneforall.javacore.introductionmethods.domain;

import java.util.Arrays;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salaries != null) {
            System.out.println(Arrays.toString(this.salaries));
            averageSalaries();
        }
    }

    public void averageSalaries() {
        if (salaries == null) return;

        double average = 0;

        for (double salary : salaries) {
            average += salary;
        }
        average /= salaries.length;
        System.out.printf("The average of the salaries is: %f", average);
    }

}
