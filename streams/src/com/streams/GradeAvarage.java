package com.streams;

public class GradeAvarage {
    private double sumOfStudentGrades;
    private int amountOfStudentGrades;

    public GradeAvarage(){}

    public GradeAvarage addStudentGrade(double studentGrade) {
        this.sumOfStudentGrades += studentGrade;
        this.amountOfStudentGrades += 1;
        return this;
    }

    public double getGradeAvarage() {
        return this.sumOfStudentGrades / this.amountOfStudentGrades;
    }

    public static GradeAvarage combineGradesAvarages(GradeAvarage ga1, GradeAvarage ga2){
        GradeAvarage gradeAvarage = new GradeAvarage();
        gradeAvarage.sumOfStudentGrades = ga1.sumOfStudentGrades + ga2.sumOfStudentGrades;
        gradeAvarage.amountOfStudentGrades = ga1.amountOfStudentGrades + ga2.amountOfStudentGrades;
        return gradeAvarage;
    }
}
