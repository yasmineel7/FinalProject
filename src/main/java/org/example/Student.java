package org.example;

import java.util.Comparator;
import java.util.LinkedList;

public class Student extends Users implements Comparator<Student>, Enrollable {
    public String email;

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
    }

}
