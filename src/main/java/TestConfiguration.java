import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* *
 *@author Kavya R
 *@created 26-11-2023
 *@project ReportSample
 */
public class TestConfiguration {
    private static String environmentValue;
    private static String userValue;
    private static String browserValue;
    private static String executionMode;
    private static String osValue;
    private static String reportHeader;
    private static String testName;

    // Private constructor to prevent instantiation
    private TestConfiguration() {}

    // Set test environment details
    public static void setTestEnvironment(String environmentValue) {
        TestConfiguration.environmentValue = environmentValue;
    }

    // Get test environment details
    public static String getTestEnvironment() {
        return environmentValue;
    }

    // Get test environment details
    public static String getTestDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    // Set test user details
    public static void setTestUser(String userValue) {
        TestConfiguration.userValue = userValue;
    }

    // Get test user details
    public static String getTestUser() {
        return userValue;
    }

    // Set test browser details
    public static void setTestBrowser(String browserValue) {
        TestConfiguration.browserValue = browserValue;
    }

    // Get test browser details
    public static String getTestBrowser() {
        return browserValue;
    }

    // Set test execution mode details
    public static void setTestExecutionMode(String executionMode) {
        TestConfiguration.executionMode = executionMode;
    }

    // Get test execution mode details
    public static String getTestExecutionMode() {
        return executionMode;
    }

    // Set test OS details
    public static void setOsValue(String osValue) {
        TestConfiguration.osValue = osValue;
    }

    // Get test OS details
    public static String getOsValue() {
        return osValue;
    }

    // Set test Header
    public static void setReportHeader(String reportHeader) {
        TestConfiguration.reportHeader = reportHeader;
    }

    // Get test Header
    public static String getReportHeader() {
        return reportHeader;
    }

    // Set test Name
    public static void setTestName(String testName) {
        TestConfiguration.testName = testName;
    }

    // Get test Name
    public static String getTestName() {
        return testName;
    }

}
