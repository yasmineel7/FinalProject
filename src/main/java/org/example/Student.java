package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

public class Student extends Users implements Comparator<Student>, Enrollable {
    private String email;

    public Student(String name, int id, String email) {
        super(name, id);
        this.email = email;
    }


    public void enroll(Student s) {
        //TODO:enroll the student to a course (Complementary or mandatory)
    }

    @Override
    void PrintDetail() {
        //TODO:print the information of the student
        super.PrintDetail();
    }

    @Override
    public int compare(Student o1, Student o2) {
        //TODO:sort the information of the student using id, name, email and courses
        return 0;
    }

    private static LinkedList<Student> readTranscript(String path) {
        //TODO: use TextIO to te read the transcript
        return null;
    }

    private static void writeTranscript(String path, LinkedList<Student> students) {
        //TODO: write the transcript using TextIO
        File file = new File(path);
        try (FileWriter fw = new FileWriter(file)) {
            for (Student student : students) {
                fw.write(student.getName() + ",");
                fw.write(student.getId() + ",");
                fw.write(student.getEmail() + ",");

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static LinkedList<Course> register() {
        //TODO: register for complementary and mandatory course
        return null;
    }

    public void displayCourses(Set<Course> complementaryCourses, Set<Course> mandatoryCourse) {
        //TODO: combine 2 sets of course to display all the courses registered by the student
    }

    public static LinkedList<Course> drop() {
        //TODO: drop for complementary and mandatory course
        // can only drop one course at a time
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                '}' + super.toString();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
