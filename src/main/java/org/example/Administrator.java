package org.example;

import java.util.LinkedList;
import java.util.List;

public class Administrator {

    public Administrator(String name, int id) {
        super();
    }

    /**
     * read the transcript of the student
     * @param path the path of the file
     * @return the list of students
     */
    public static List<Student> readTranscript(String path) {
        return Student.readTranscript(path);
    }

    @Override
    public String toString() {
        return "Administrator{}" + super.toString();
    }
}
