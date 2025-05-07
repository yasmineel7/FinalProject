package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
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

    /**
     * remove a student from a course
     * @param student the input student
     */
    public void drop(Student student) {
        if (students.contains(student)) {
            students.remove(student);
        }
    }

    /**
     * display all the courses
     * @param complementaryCourses the input set of complementary course
     * @param mandatoryCourse the input set of mandatory course
     */
    public void displayCourses(Set<ComplementaryCourse> complementaryCourses, Set<MandatoryCourse> mandatoryCourse) {
        if (complementaryCourses.isEmpty()) {
            for (MandatoryCourse mandatoryCourse1: mandatoryCourse) {
                System.out.println(mandatoryCourse1);
            }
        }
        if (mandatoryCourse.isEmpty()) {
            for (ComplementaryCourse complementaryCourse1: complementaryCourses) {
                System.out.println(complementaryCourse1);
            }
        }
        if (complementaryCourses.isEmpty() && mandatoryCourse.isEmpty()) {
            System.out.println("there is no course");
        }
        Set<Course> courses = new HashSet<>(complementaryCourses);
        courses.addAll(mandatoryCourse);
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

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", nameCourse='" + nameCourse + '\'' +
                ", priceCourse=" + priceCourse +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return priceCourse == course.priceCourse && Objects.equals(code, course.code) && Objects.equals(nameCourse, course.nameCourse) && Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, nameCourse, priceCourse, students);
    }
}
