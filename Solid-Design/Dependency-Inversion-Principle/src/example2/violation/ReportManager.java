package example2.violation;

public class ReportManager {

    private PDFReportGenerator pdfReportGenerator;

    public ReportManager() {
        this.pdfReportGenerator = new PDFReportGenerator(); // Tight Coupling to a concrete class
    }

    public void generateReport(String data) {
        pdfReportGenerator.generatePDFReport(data);
    }
}
