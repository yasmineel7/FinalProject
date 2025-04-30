package org.example;

import java.util.List;
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
        //TODO:enroll the student to a course (Complementary or mandatory)

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

}
