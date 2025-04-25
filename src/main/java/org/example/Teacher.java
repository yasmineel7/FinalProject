package org.example;

import java.util.List;
import java.util.Objects;

public class Teacher extends Users{
    private List<Integer> grades;

    public Teacher(String name, int id, List<Integer> grades) {
        super();
        this.grades = grades;
    }

    public Teacher(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    void PrintDetail() {
        //TODO: print the details of the teacher
        super.PrintDetail();
    }

    public static double calculateAverage(List<Integer> grades) {
        //TODO: calculate the average of each student

        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(grades, teacher.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grades);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "grades=" + grades +
                '}';
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}
