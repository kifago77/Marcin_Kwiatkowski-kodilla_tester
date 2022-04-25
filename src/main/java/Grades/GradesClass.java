package Grades;

import Grades.GradesConstructor;

public class GradesClass {
    public static void main(String[] args) {
        GradesConstructor verification = new GradesConstructor();
        verification.add(5);
        verification.getLastGrades();
        System.out.println(verification.getLastGrades());
        verification.getAverage();
        System.out.println(verification.getAverage());


        verification.getAverage();



        }

}
