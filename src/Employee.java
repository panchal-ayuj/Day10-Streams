import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Employee {
    String name;
//    double salary;
//    Date doj;

//    public Employee(String name, double salary, Date doj) {
//        this.name = name;
//        this.salary = salary;
//        this.doj = doj;
//    }
    List<Project> projectList;
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", salary=" + salary +
//                ", doj=" + doj +
//                '}';
//    }


    public String getName() {
        return name;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public Employee(String name, List<Project> projectList) {
        this.name = name;
        this.projectList = projectList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", projectList=" + projectList +
                '}';
    }
}

class Project {
    String name;
    int cost;

    public Project(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        Project project = (Project) o;
        return Objects.equals(name, project.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}