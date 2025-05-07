package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Student extends Users implements Comparable<Student> {
    private String email;

    public Student(String name, int id, String email) {
        super(name, id);
        this.email = email;
    }

    @Override
    public int compareTo(Student o) {
        return (this.id - o.id) * 1000
                + this.name.compareTo(o.name) * 10
                + this.email.compareTo(o.email);
    }


    @Override
    void PrintDetail() {
        //TODO:print the information of the student
      super.PrintDetail();
      toString();
    }

    /**
     * read the transcript of the student
     * @param path the input path of the file
     * @return the list of students
     */
    public static List<Student> readTranscript(String path) {
        List<Student> students = new ArrayList<>();
        File file = new File(path);
        try  {
            Scanner scanner = new Scanner(file);
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] str = line.split(",");
                String name = str[0];
                int id = Integer.parseInt(str[1]);
                String email = str[2];
                Student student = new Student(name, id, email) {

                };
                students.add(student);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    /**
     * write the transcript of the student in a csv file
     * @param path the input path of the file
     * @param students the list of students
     */
    public static void writeTranscript(String path, List<Student> students) {
        File file = new File(path);
        try (FileWriter fw = new FileWriter(file, true)) {
            for (Student student : students) {
                fw.write(student.getName() + ",");
                fw.write(student.getId() + ",");
                fw.write(student.getEmail() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
