import java.util.List;

public class Student {
    String name;
    List<Accessment> accessmentList;

    public Student(String name, List<Accessment> accessmentList) {
        this.name = name;
        this.accessmentList = accessmentList;
    }

    public String getName() {
        return name;
    }

    public List<Accessment> getAccessmentList() {
        return accessmentList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", accessmentList=" + accessmentList +
                '}';
    }
}

class Accessment {
    String name;
    int grades;

    public Accessment(String name, int grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Accessment{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
