import org.example.Course;
import org.example.MandatoryCourse;
import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestMandatoryCourse {
    @Test
    public void CalculateFee() {
        Set<Course> courses = new HashSet<>();
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("John", 1, "3545@gmail.com");
        //Course c1 = new Course("SN11", "programming", 150, students);
        MandatoryCourse c2 = new MandatoryCourse("SN11", "programming", 150, students);
        MandatoryCourse c4 = new MandatoryCourse("SN11", "programming", 150, students);
        //Course c3 = new Course("SN11", "programming", 150, students);

        //courses.add(c1);
        courses.add(c2);
        courses.add(c4);
      //  courses.add(c3);

        double expected = 150;

        double result = MandatoryCourse.calculateFee(courses);
        Assertions.assertEquals(expected,result);
    }
}
