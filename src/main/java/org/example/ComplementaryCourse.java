package org.example;

public class ComplementaryCourse extends Course{
    protected String code;

    @Override
    public int compareTo(Course o) {
        //TODO: sort the courses depending on the code
        return super.compareTo(o);
    }
}
