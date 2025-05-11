package org.example;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class MandatoryCourse extends Course{
    String choice;

    public MandatoryCourse(String code, String nameCourse, int priceCourse, List<Student> students, String choice) {
        super(code, nameCourse, priceCourse, students);
        this.choice = choice;
    }

    @Override
   public void calculateFee(Set<Course> courses) {
     super.calculateFee(courses);
    }

    @Override
    public void enroll(Student s) {
        if(!students.contains(s)) {
            super.enroll(s);
            System.out.println("added Student34222");
        }
    }

    @Override
    public int compareTo(Course o) {
        return super.compareTo(o);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MandatoryCourse that = (MandatoryCourse) o;
        return Objects.equals(choice, that.choice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), choice);
    }

    @Override
    public String toString() {
        return "MandatoryCourse{" +
                "choice='" + choice + '\'' +
                '}' + super.toString();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}
