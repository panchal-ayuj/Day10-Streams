import java.util.*;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("A", Arrays.asList(new Accessment("T1", 40), new Accessment("T2", 60), new Accessment("T3", 70)));
        Student s2 = new Student("B", Arrays.asList(new Accessment("T1", 50), new Accessment("T2", 60), new Accessment("T4", 70)));
        Student s3 = new Student("C", Arrays.asList(new Accessment("T1", 40), new Accessment("T2", 80)));
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Map<String, OptionalDouble> result = students.stream().collect(Collectors.toMap(student -> student.name, student -> student.accessmentList.stream().mapToInt(Accessment::getGrades).average()));
        System.out.println(result);

        Student bestStudent = students.stream().sorted((student1, student2) -> ((Double)student1.accessmentList.stream().mapToInt(Accessment::getGrades).average().getAsDouble()).compareTo((Double)student2.accessmentList.stream().mapToInt(Accessment::getGrades).average().getAsDouble())).findFirst().get();
        System.out.println(bestStudent);
    }
}
