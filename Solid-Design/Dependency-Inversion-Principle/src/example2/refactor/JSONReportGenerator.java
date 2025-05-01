package example2.refactor;

public class JSONReportGenerator implements ReportGenerator{

    @Override
    public void generateReport(String data) {
        System.out.println("JSON Report Generated with data : " + data);
    }
}
