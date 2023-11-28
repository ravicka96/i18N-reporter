/* *
 *@author Kavya R
 *@created 28-11-2023
 *@project i18N-reporter
 */
public class DurationConfiguration {
    private String testName;
    private int testDuration;

    public DurationConfiguration(String testName, int testDuration) {
        this.testName = testName;
        this.testDuration = testDuration;
    }

    public String getTestName() {
        return testName;
    }

    public int getTestDuration() {
        return testDuration;
    }
}
