package example2.violation;

public class Runner {

    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 1234, "john.doe@xyz.com");
        employee.calculateSalary();
        employee.save();
        employee.sendEmail();
    }
}
