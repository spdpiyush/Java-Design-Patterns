package example2.refactor;

public class EmployeeMailer {

    public void sendEmail(Employee employee) {
        System.out.println("sending email to employee " + employee.getName());
    }
}
