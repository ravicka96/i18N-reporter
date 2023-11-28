/* *
 *@author Kavya R
 *@created 26-11-2023
 *@project ReportSample
 */
public class TestResult {
    private String languageValue;
    private String expectedValue;
    private String actualValue;
    private String statusValue;

    public TestResult(String languageValue, String expectedValue, String actualValue, String statusValue) {
        this.languageValue = languageValue;
        this.expectedValue = expectedValue;
        this.actualValue = actualValue;
        this.statusValue = statusValue;
    }

    public String getLanguage() {
        return languageValue;
    }

    public String getExpectedValue() {
        return expectedValue;
    }

    public String getActualValue() {
        return actualValue;
    }

    public String getStatusValue() {
        return statusValue;
    }
}
