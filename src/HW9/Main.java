package HW9;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Course course1 = new CourseImpl("Course 1");
        Course course2 = new CourseImpl("Course 2");
        Course course3 = new CourseImpl("Course 3");
        Course course4 = new CourseImpl("Course 4");
        Course course5 = new CourseImpl("Course 5");

        Student student1 = new StudentImpl("Yulia", course1, course2, course3);
        Student student2 = new StudentImpl("Dima", course3, course2);
        Student student3 = new StudentImpl("Vasya", course1, course2, course3, course4, course5);
        Student student4 = new StudentImpl("Petya", course2);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(getUniqueCourses(students));
        System.out.println(getMostInquisitiveStudents(students));
        System.out.println(getStudentsByCourse(students, course5));
    }


    /**
     *     public static List<Course> getUniqueCourses(List<Student> students) {
     *         List<Course> allCourses = new ArrayList<>();
     *         for(Student student: students) {
     *             allCourses.addAll(student.getAllCourses());
     *         }
     *         Set<Course> uniqueSet = new HashSet<>(allCourses);
     *         return new ArrayList<>(uniqueSet);
     *     }
     * @param students список студентов
     * @return список уникальных курсов
     */
    public static List<Course> getUniqueCourses(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getAllCourses().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * Функция принимает список студентов и возвращает список самых любознательных, т.е.
     * 3 студентов, у которых больше всего курсов
     *
     * @param students список студентов
     * @return любознательные
     */
    public static List<Student> getMostInquisitiveStudents(List<Student> students) {
        List<Student> studentsSorted = students.stream()
                .sorted(Comparator.comparingInt(student -> student.getAllCourses().size()))
                .collect(Collectors.toList());
        Collections.reverse(studentsSorted);
        return studentsSorted.stream()
                .limit(3)
                .collect(Collectors.toList());
    }

    /**
     * Функция возвращает список студентов, у которых есть заданный курс
     *
     * @param students список студентов
     * @param course   курс для фильтрации
     * @return отфильтрованный список студентов
     */
    public static List<Student> getStudentsByCourse(List<Student> students, Course course) {
        return students.stream()
                .filter(student -> student.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }
}
