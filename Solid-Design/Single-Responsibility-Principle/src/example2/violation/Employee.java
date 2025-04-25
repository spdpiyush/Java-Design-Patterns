package example2.violation;

/**
 * Employee Class handles
 * business logic, persistence, communication.
 * 3 Reasons to change. violates SRP
 */
public class Employee {

    private String name;
    private int id;
    private String email;

    public Employee(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public void calculateSalary() {
        System.out.println("Calculating Salary..");
    }

    public void save() {
        System.out.println("Saving Employee to File..");
    }

    public void sendEmail() {
        System.out.println("Sending Email to : " + email);
    }
}
