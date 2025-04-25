package org.example;

import java.util.List;
import java.util.Objects;

public class MandatoryCourse extends Course{
    private String code;
    private List courses;

    public MandatoryCourse(String code, List courses) {
        super();
        this.code = code;
        this.courses = courses;
    }

    public MandatoryCourse() {

    }

    @Override
    public int compareTo(Course o) {
        //TODO: sort the courses depending on the code
        return super.compareTo(o);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MandatoryCourse that = (MandatoryCourse) o;
        return Objects.equals(code, that.code) && Objects.equals(courses, that.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, courses);
    }

    @Override
    public String toString() {
        return "MandatoryCourse{" +
                "code='" + code + '\'' +
                ", courses=" + courses +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List getCourses() {
        return courses;
    }

    public void setCourses(List courses) {
        this.courses = courses;
    }
}
