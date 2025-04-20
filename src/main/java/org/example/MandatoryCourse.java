package org.example;

import java.util.List;

public class MandatoryCourse extends Course{
    protected String code;
    protected List courses;

    @Override
    public int compareTo(Course o) {
        //TODO: sort the courses depending on the code
        return super.compareTo(o);
    }
}
