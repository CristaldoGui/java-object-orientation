package guilherme.javaoneforall.javacore.introductionmethods.tests;

import guilherme.javaoneforall.javacore.introductionmethods.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Guilherme";
        student1.age = 20;
        student1.gender = 'M';

        student2.name = "Raul";
        student2.age = 18;
        student2.gender = 'M';

        student1.print();
        student2.print();
    }
}
