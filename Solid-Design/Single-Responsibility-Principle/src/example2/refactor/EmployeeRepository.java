package example2.refactor;

public class EmployeeRepository {

    public void save(Employee employee) {
        System.out.println("saving Employee " + employee.toString());
    }
}
