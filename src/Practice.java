import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) throws ParseException {
        List<Employee> employees = new ArrayList<>();
//        SimpleDateFormat dateInput = new SimpleDateFormat("dd-MM-yyyy");
//        Employee e1 = new Employee("A", 1000, dateInput.parse("10-02-2012"));
//        Employee e2 = new Employee("B", 2000, dateInput.parse("14-05-2010"));
//        Employee e3 = new Employee("C", 3000, dateInput.parse("15-07-2016"));
//        employees.add(e1);
//        employees.add(e2);
//        employees.add(e3);
//        List<Employee> result = employees.stream().sorted((o1, o2) -> o1.doj.compareTo(o2.doj)).collect(Collectors.toList());
//
//        System.out.println(result.get(0));
//        System.out.println(employees.stream().sorted((o1, o2) -> o2.doj.compareTo(o1.doj)).findFirst().get().name);
        Employee e1 = new Employee("A", Arrays.asList(new Project("P1", 100), new Project("P2", 200), new Project("P3", 300)));
        Employee e2 = new Employee("B", Arrays.asList(new Project("P3", 500), new Project("P5", 700), new Project("P6", 900)));
        Employee e3 = new Employee("C", Arrays.asList(new Project("P6", 600), new Project("P8", 100), new Project("P9", 1200)));
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

//        List<Integer> result = employees.stream().mapToInt().reduce((a,b)->a.projectList.stream().reduce((c,d)->c.cost+ d.cost) + b.projectList.stream().reduce((c,d)->c.cost+ d.cost));
        Map<String, Integer> result = employees.stream().collect(Collectors.toMap(employee -> employee.name, employee -> employee.projectList.stream().mapToInt(project -> project.cost).reduce(0, (c1, c2) -> c1 + c2)));
        System.out.println(result);

        List<Project> projectList = employees.stream().flatMap(employee -> employee.projectList.stream()).distinct().collect(Collectors.toList());
        System.out.println(projectList);
    }
}
