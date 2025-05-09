package org.example;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Teacher extends Users{
    private List<Integer> grades;

    public Teacher(String name, int id, List<Integer> grades) {
        super(name, id);
        this.grades = grades;
    }

    public Teacher(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    void PrintDetail() {
        super.PrintDetail();
    }

    /**
     * calculate the average grade of the student
     * @param grades the input list of grades
     * @return the average of the grades
     */
    public static double calculateAverage(List<Integer> grades) {
        if (grades.isEmpty()) {
            return 0;
        }

        double sum = 0;
        double avg;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
         avg = sum / grades.size();
        return avg;
    }

    /**
     * Groups grades into ranges and counts occurrences.
     * @return Map of grade ranges to counts.
     */
    public Map<String, Long> groupGradesByRange() {
        if (grades.isEmpty()) {
            return null;
        }
        return grades.stream()
                .collect(Collectors.groupingBy(
                        grade -> {
                            if (grade >= 90) return "90 - 100 ";
                            else if (grade >= 80) return "80 - 89 ";
                            else if (grade >= 70) return "70 - 79 ";
                            else if (grade >= 60) return "60 - 69 ";
                            else return "0 - 59 ";
                        },
                        Collectors.counting()
                ));
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
                '}'+ super.toString();
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}
