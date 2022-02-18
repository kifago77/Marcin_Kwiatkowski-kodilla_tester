package Grades;

public class GradesConstructor {

    private int[] grades;
    private int size;

    public GradesConstructor() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if(this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;

    }
    public int getLastGrades() {
        int grade = grades[size-1];
        return grade;
    }
    public int getAverage() {
        int quantity = size;
        int sum = 0;
        for (int i =0; i < size; i++) {
            sum += grades[i];

        }
        int average = sum/quantity;
        return average;


    }

    }




