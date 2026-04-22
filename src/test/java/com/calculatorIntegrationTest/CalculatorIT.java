package com.calculatorIntegrationTest;

import org.apache.commons.io.FileUtils;
import org.athira.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

// ✅Purpose
//  To dump the result of each operation into a file
//  We will crosscheck if the file is getting created(AAssertion)
//  Cross check if the right content is written in the file(Assertion)
public class CalculatorIT {
    @Test
    public  void CalculatorIntegrationTest() throws IOException {
        Calculator cal = new Calculator();
        // ✅ Ensure the integration test output directory is created inside target for storing test artifacts
        // ✅ This ensures that test results are generated inside the target directory when the Maven test runs.
        File outputDir = new File("target/integrationTest");
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

        File outputFile = new File(outputDir,"CalIntegrationResult.txt");
        double addResult = cal.add(10,10);
        double subtractResult = cal.subtract(100,10);
        double multiplyResult = cal.multiply(20,10);
        double divideResult = cal.divide(100,10);

        List<String> outputLines = Arrays.asList( // ✅ Arrays.asList returns a List<String>
                String.valueOf(addResult), // ✅String.valueOf() - converts any value into a String.
                String.valueOf(subtractResult),
                String.valueOf(multiplyResult),
                String.valueOf(divideResult)
        );
        FileUtils.writeLines(outputFile,outputLines);
        //✅FileUtils is a utility library in Apache commons I/O which supports reading, writing, copying, and deleting files and directories operation.

        //✅Check whether the file is created or not using assertion
        Assert.assertTrue(outputFile.exists(),"CalIntegrationResult.txt should be present");
    }
}
