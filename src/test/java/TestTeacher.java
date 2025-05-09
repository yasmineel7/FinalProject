import org.example.Course;
import org.example.Teacher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTeacher {

    @Test
    public void TestCalculateAverage() {
        List<Integer> grades = Arrays.asList(77, 66, 78, 81);

        double expected = (double) (77 + 66 + 78 + 81) / grades.size();
        double result = Teacher.calculateAverage(grades);

        assertEquals(expected, result);
    }

    @Test
    public void TestCalculateAverage1() {
        List<Integer> grades = new ArrayList<>();

        double expected = 0;
        double result = Teacher.calculateAverage(grades);

        assertEquals(expected, result);
    }

    @Test
    public void TestCalculateAverage2() {
        List<Integer> grades = Arrays.asList(77, 66, 78, 81, - 44);

        double expected = (double) (77 + 66 + 78 + 81 - 44) / grades.size();
        double result = Teacher.calculateAverage(grades);

        assertEquals(expected, result);
    }

    @Test
    public void testGroupGradesByRange() {
        Teacher teacher = new Teacher(List.of(55, 65, 75, 95));
        Map<String, Long> result = teacher.groupGradesByRange();

        Map<String, Long> expected = new TreeMap<>();
        expected.put("90 - 100 ", 1L);
        expected.put("0 - 59 ", 1L);
        expected.put("60 - 69 ", 1L);
        expected.put("70 - 79 ", 1L);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGroupGradesByRange1() {
        Teacher teacher = new Teacher(List.of(55, 43, 34, 22));
        Map<String, Long> result = teacher.groupGradesByRange();

        Map<String, Long> expected = new TreeMap<>();
        expected.put("0 - 59 ", 4L);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGroupGradesByRange2() {
        Teacher teacher = new Teacher(List.of(75, 96, 87, 88, 91,44,44,44));
        Map<String, Long> result = teacher.groupGradesByRange();

        Map<String, Long> expected = new TreeMap<>();
        expected.put("90 - 100 ", 2L);
        expected.put("0 - 59 ", 3L);
        expected.put("70 - 79 ", 1L);
        expected.put("80 - 89 ", 2L);
        Assertions.assertEquals(expected, result);
    }



}
