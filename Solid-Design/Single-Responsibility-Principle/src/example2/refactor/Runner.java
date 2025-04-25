package example2.refactor;

public class Runner {

    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 12345, "john.doe@xyz.com");
        employee.calculateSalary();

        EmployeeRepository repository = new EmployeeRepository();
        repository.save(employee);

        EmployeeMailer mailer = new EmployeeMailer();
        mailer.sendEmail(employee);
    }
}
