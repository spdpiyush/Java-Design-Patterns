package example2.refactor;

public class Runner {

    public static void main(String[] args) {

        ReportManager reportManager = new ReportManager(new PDFReportGenerator());
        reportManager.generate("Weekly SALES Data!!");

        reportManager = new ReportManager(new ExcelReportGenerator());
        reportManager.generate("Annual Revenue Data");

        reportManager = new ReportManager(new JSONReportGenerator());
        reportManager.generate("{\"firstName\" : \"johnDoe\"}");
    }
}
