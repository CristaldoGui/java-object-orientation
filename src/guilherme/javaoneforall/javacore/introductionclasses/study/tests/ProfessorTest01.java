package guilherme.javaoneforall.javacore.introductionclasses.study.tests;

import guilherme.javaoneforall.javacore.introductionclasses.study.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Raul Cristaldo";
        professor.age = 19;
        professor.gender  = 'M';

        System.out.printf("Name: %s Age: %d and Gender: %c", professor.name, professor.age, professor.gender);
    }
}
