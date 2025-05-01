package example2.refactor;

public class ExcelReportGenerator implements ReportGenerator{

    @Override
    public void generateReport(String data) {
        System.out.println("Excel Report Generated with Data : " + data);
    }
}
