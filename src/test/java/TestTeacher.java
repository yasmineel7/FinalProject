import org.example.Course;
import org.example.Teacher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestTeacher {

    @Test
    public void TestCalculateAverage() {
        List<Integer> grades = Arrays.asList(77, 66, 78, 81);

        double expected = (double) (77 + 66 + 78 + 81) / grades.size();
        double result = Teacher.calculateAverage(grades);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void TestCalculateAverage1() {
        List<Integer> grades = new ArrayList<>();

        double expected = 0;
        double result = Teacher.calculateAverage(grades);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void TestCalculateAverage2() {
        List<Integer> grades = Arrays.asList(77, 66, 78, 81, - 44);

        double expected = (double) (77 + 66 + 78 + 81 - 44) / grades.size();
        double result = Teacher.calculateAverage(grades);

        Assertions.assertEquals(expected, result);
    }



}
