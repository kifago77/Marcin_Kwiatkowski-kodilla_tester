package Grades;

import Grades.GradesConstructor;

public class GradesClass {
    public static void main(String[] args) {
        GradesConstructor verification = new GradesConstructor();
        verification.add(2);
        System.out.println(verification.getLastGrades());
        System.out.println(verification.getAverage());



        }

}
