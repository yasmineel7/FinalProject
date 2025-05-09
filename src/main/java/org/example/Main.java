package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

       List<Student> studentList = new ArrayList<>();
       studentList.add(new Student("yas", 3, "f435@gmail.com"));
       Student student1 = new Student("yas", 1, "g344@gmail.com");
       Student.writeTranscript("src/main/java/org/example/TranscriptStudent", studentList);
        List<Student> students = Student.readTranscript("src/main/java/org/example/TranscriptStudent");
        for (int i = 0; i < students.size();i++) {
            System.out.println(students.get(i));
        }
List<Student> students2 = new ArrayList<>();

        Student s = new Student("yas", 1, "rdd@gmail.com");
        Student t = new Student("john", 2, "rrr@gmail.com");
        students2.add(s);
        ComplementaryCourse courses = new ComplementaryCourse("SN1", "programming"
                , 200, students2, "frr");
       courses.enroll(t);

        List<Student> students3 = new ArrayList<>();
        Student s1 = new Student("john",1, "54554@gmail.com");
        Student s2 = new Student("Lucie",2, "554@gmail.com");
        students3.add(s1);
        students3.add(s2);
                Set<ComplementaryCourse> complementaryCourses = new HashSet<>();
        ComplementaryCourse c = new ComplementaryCourse("43322", "math",
                122, students, "complementary");
        ComplementaryCourse c1 = new ComplementaryCourse("3SN", "physic",
                150, students, "complementary");
        complementaryCourses.add(c);
        complementaryCourses.add(c1);

        Set<MandatoryCourse> mandatoryCourses = new HashSet<>();
        MandatoryCourse m = new MandatoryCourse("3sn", "programming", 150, students, "math");
        MandatoryCourse m1 = new MandatoryCourse("3356", "programming1", 170, students, "phys");
        courses.displayCourses(complementaryCourses, mandatoryCourses);

    }

}