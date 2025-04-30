package org.example;

import java.util.List;
import java.util.Set;

public class MandatoryCourse extends Course{
    private Set<Course> MandatoryCourses;


    public MandatoryCourse(String code, String nameCourse, int priceCourse, List<Student> students) {
        super(code, nameCourse, priceCourse, students);
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
        //TODO: sort the courses depending on the code
        return super.compareTo(o);
    }

}
