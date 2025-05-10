import org.example.ComplementaryCourse;
import org.example.Main;
import org.example.MandatoryCourse;
import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestCourse {
    @Test
    public void TestdisplayCourse() {
        List<Student> students = new ArrayList<>();
        Student s = new Student("john",1, "54554@gmail.com");
        Student s2 = new Student("Lucie",2, "554@gmail.com");
        students.add(s);
        students.add(s2);
        Set<ComplementaryCourse> complementaryCourses = new HashSet<>();
        ComplementaryCourse c = new ComplementaryCourse("43322", "math",
                122, students, "complementary");
        ComplementaryCourse c1 = new ComplementaryCourse("3SN", "physic",
                150, students, "complementary");
        complementaryCourses.add(c);
        complementaryCourses.add(c1);

        Set<MandatoryCourse> mandatoryCourses = new HashSet<>();
       MandatoryCourse m = new MandatoryCourse("3sn", "programming", 150, students, "computer science1");
       MandatoryCourse m1 = new MandatoryCourse("3356", "programming1", 170, students, "computer science 2");

    }
}
