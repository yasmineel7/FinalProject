package org.example;

import java.util.Set;

public class Course implements Comparable<Course>{

    protected Set<Course> courses;

    public static double calculateFee() {
        //TODO: calculate fee for all the courses chosen (mandatory or complementary)
        return 0;
    }

    @Override
    public int compareTo(Course o) {
        //TODO: sort the courses (mandatory and complementary) depending on each of their code
        return 0;
    }
}
