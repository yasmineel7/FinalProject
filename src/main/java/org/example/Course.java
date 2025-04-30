package org.example;

import java.util.List;
import java.util.Set;

public class Course implements Comparable<Course>{
    protected String code;
    protected String nameCourse;
    protected int priceCourse;
    protected List<Student> students;

    public Course(String code, String nameCourse, int priceCourse, List<Student> students) {
        this.code = code;
        this.nameCourse = nameCourse;
        this.priceCourse = priceCourse;
        this.students = students;
    }

    /**
     * calculate the fee of each course of the student
     * depending on if it's a mandatory or complementary course
     * @param courses the input set of course
     */
    public void calculateFee(Set<Course> courses) {
        double sum = 0;
        double avg = 0;
        int count = 0;

        for (Course course: courses) {
            if (course instanceof MandatoryCourse) {
                sum += course.getPriceCourse();
                count++;
            }
            avg = sum / count;
        }

        for (Course course: courses) {
            if (course instanceof ComplementaryCourse) {
                sum += course.getPriceCourse();
                count++;
            }
            avg = sum / count;
        }
    }

    @Override
    public int compareTo(Course o) {
        //TODO: sort the courses (mandatory and complementary) depending on each of their code
        return this.code.compareTo(o.code);
    }

    /**
     * enroll a student to a course
     * @param s the input student
     */
    public void enroll(Student s) {
            if(!students.contains(s)) {
                students.add(s);
                System.out.println("added Student");
            }

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getPriceCourse() {
        return priceCourse;
    }

    public void setPriceCourse(int priceCourse) {
        this.priceCourse = priceCourse;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
