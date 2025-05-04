package org.example;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ComplementaryCourse extends Course{
    private String choice;

    public ComplementaryCourse(String code, String nameCourse, int priceCourse, List<Student> students, String choice) {
        super(code, nameCourse, priceCourse, students);
        this.choice = choice;
    }

    @Override
    public void calculateFee(Set<Course> courses) {
       super.calculateFee(courses);
    }

    @Override
    public void enroll(Student s) {

        if (!students.contains(s)) {
            super.enroll(s);
            System.out.println("added Student3333");
        }

    }

    @Override
    public int compareTo(Course o) {
        //TODO: sort the courses depending on the code
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return "ComplementaryCourse{" +
                "choice='" + choice + '\'' +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComplementaryCourse that = (ComplementaryCourse) o;
        return Objects.equals(choice, that.choice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), choice);
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}
