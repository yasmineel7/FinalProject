package org.example;

import java.util.Comparator;

public class Student extends Users implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        //TODO:sort the information of the student using id, name, email and courses
        return 0;
    }
}
