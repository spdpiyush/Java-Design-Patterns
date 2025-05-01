package example2.refactor;

public class PDFReportGenerator implements ReportGenerator{

    @Override
    public void generateReport(String data) {
        System.out.println("PDF Report Generated with Data : " + data);
    }
}
