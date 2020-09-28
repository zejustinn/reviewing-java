package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamReduce {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> sum = (ac, n) -> ac + n;

        Integer result1 = nums.stream().reduce(sum).get();
        System.out.println(result1);

        // WARNING: The use of streams will use a new initial value at each reduce method call
        Integer result2 =  nums.parallelStream().reduce(100, sum);
        System.out.println(result2);

        List<Student> schoolClass = Arrays.asList(
                new Student("Delgado", 4.7),
                new Student("Pores", 2.1),
                new Student("Ivanilso", 8.5),
                new Student("Kevin", 6.3)
        );

        Predicate<Student> functionApproved = student -> student.grade >= 6;
        Function<Student, Double> functionStudentGrade = student -> student.grade;
        BiFunction<GradeAvarage, Double, GradeAvarage> functionGradeAvarage =
                (gradeAvarage, studentGrade) -> gradeAvarage.addStudentGrade(studentGrade);

        BinaryOperator<GradeAvarage> functionCombineGradeAvarages =
            (ga1, ga2) -> GradeAvarage.combineGradesAvarages(ga1, ga2);

        GradeAvarage gradeAvarage = schoolClass.stream()
                .filter(functionApproved)
                .map(functionStudentGrade)
                .reduce(new GradeAvarage(), functionGradeAvarage, functionCombineGradeAvarages);

        System.out.println(gradeAvarage.getGradeAvarage());
    }
}
