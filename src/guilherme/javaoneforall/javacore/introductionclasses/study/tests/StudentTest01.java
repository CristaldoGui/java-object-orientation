package guilherme.javaoneforall.javacore.introductionclasses.study.tests;

import guilherme.javaoneforall.javacore.introductionclasses.study.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Guilherme Cristaldo";
        student.age = 20;
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
