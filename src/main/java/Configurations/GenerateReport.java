package Configurations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/* *
 *@author Kavya R
 *@created 28-11-2023
 *@project i18N-reporter
 */
public class GenerateReport {
    public void generateThymeLeafReport(List<TestResult> testResults, List<DurationConfiguration> durationConfigurations, List<ExceptionConfiguration> customExceptions) {
        int passedCount = 0, failedCount = 0, skippedCount = 0, totalCount = 0;

        // Configure Thymeleaf template resolver
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML");

        // Create a Thymeleaf template engine
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        // Process the Thymeleaf template
        Context context = new Context();
        context.setVariable("reportHeader", TestConfiguration.getReportHeader());
        context.setVariable("executionDate", TestConfiguration.getTestDate());
        context.setVariable("testerName", TestConfiguration.getTestUser());
        context.setVariable("testEnvironment", TestConfiguration.getTestEnvironment());
        context.setVariable("browserType", TestConfiguration.getTestBrowser());
        context.setVariable("browserMode", TestConfiguration.getTestExecutionMode());
        context.setVariable("osName", TestConfiguration.getOsValue());
        context.setVariable("testResults", testResults);
        context.setVariable("exceptions", customExceptions);
        context.setVariable("exceptionCount", customExceptions.size());

        for (TestResult testResult : testResults) {
            if (testResult.getStatusValue().equalsIgnoreCase("PASS")) {
                passedCount++;
            } else if (testResult.getStatusValue().equalsIgnoreCase("FAIL")) {
                failedCount++;
            } else if (testResult.getStatusValue().equalsIgnoreCase("SKIP")) {
                skippedCount++;
            }
        }

        context.setVariable("totalPassedCount", passedCount);
        context.setVariable("totalFailedCount", failedCount);
        context.setVariable("totalSkippedCount", skippedCount);
        context.setVariable("totalStatusCount", failedCount + skippedCount);
        context.setVariable("totalTestCount", passedCount + failedCount + skippedCount);

        context.setVariable("durationConfigurations", durationConfigurations);

        String templateName = "templates/index";
        String html = templateEngine.process(templateName, context);

        // Write HTML content to a file
        try (FileWriter fileWriter = new FileWriter(System.getProperty("user.dir")+ File.separator+"Reports/Report.html")) {
            fileWriter.write(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
