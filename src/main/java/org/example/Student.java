package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Student extends Users implements Comparator<Student> {
    private String email;

    public Student(String name, int id, String email) {
        super(name, id);
        this.email = email;
    }

    @Override
    void PrintDetail() {
        //TODO:print the information of the student
      super.PrintDetail();
      toString();
    }

    @Override
    public int compare(Student o1, Student o2) {
        //TODO: compare students
        return 0;
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


    public void displayCourses(Set<Course> complementaryCourses, Set<Course> mandatoryCourse) {
        //TODO: combine 2 sets of course to display all the courses registered by the student
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

    public class StudentComparator implements Comparator<Student> {
        private String type;

        public StudentComparator(String type) {
            this.type = type;
        }

        @Override
        public int compare(Student o1, Student o2) {
            switch (type) {
                case "email" -> o1.getEmail().compareTo(o2.getEmail());
                case "name" -> o1.getName().compareTo(o2.getName());
                default -> {
                    return Integer.compare(o1.getId(), o2.getId());
                }
            }

            return 0;
        }
    }

}

