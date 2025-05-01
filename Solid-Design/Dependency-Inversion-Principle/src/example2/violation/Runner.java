package example2.violation;

public class Runner {

    public static void main(String[] args) {

        ReportManager reportManager = new ReportManager();
        // can't switch to another report format without modifying ReportManager
        reportManager.generateReport("Weekly Sales Report!!!");
    }
}
