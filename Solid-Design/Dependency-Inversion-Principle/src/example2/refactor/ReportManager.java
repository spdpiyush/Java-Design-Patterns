package example2.refactor;

/**
 * -> Can plug any kind of reportGenerator without changing ReportManager
 */
public class ReportManager {

    private ReportGenerator reportGenerator;

    public ReportManager(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generate(String data) {
        reportGenerator.generateReport(data);
    }
}
