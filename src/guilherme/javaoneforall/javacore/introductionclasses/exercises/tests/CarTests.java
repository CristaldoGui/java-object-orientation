package guilherme.javaoneforall.javacore.introductionclasses.exercises.tests;

import guilherme.javaoneforall.javacore.introductionclasses.exercises.domain.Car;

public class CarTests {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        car.name = "Ciena";
        car.year = 2008;
        car.model = "1.8";

        car2.name = "Civic";
        car2.year = 2010;
        car2.model= "RayBox";

        System.out.printf("Name: %s, Year: %d and Model: %s", car2.name, car2.year, car2.model);
        System.out.printf("Name: %s, Year: %d and Model: %s%n", car.name, car.year, car.model);

        System.exit(0);
    }
}
