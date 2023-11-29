package Configurations;

/* *
 *@author Kavya R
 *@created 28-11-2023
 *@project i18N-reporter
 */
public class ExceptionConfiguration {
    private String customExceptions;

    public ExceptionConfiguration(String customExceptions) {
        this.customExceptions = customExceptions;
    }

    public String getExceptionConfigurations() {
        return customExceptions;
    }
}
