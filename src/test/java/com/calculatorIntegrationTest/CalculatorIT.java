package com.calculatorIntegrationTest;

import org.apache.commons.io.FileUtils;
import org.athira.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

// ✅Purpose
//  To dump the result of each operation into a file
//  We will crosscheck if the file is getting created(AAssertion)
//  Cross check if the right content is written in the file(Assertion)
public class CalculatorIT {

    Calculator cal;
    File outputFile;

    @BeforeClass(description = "Setup the Cal object and the artifact folder")// set up before test execution
    public void setup() {
        cal = new Calculator();
        // ✅ This ensures that test results are generated inside the target directory when the Maven test runs.
        File outputDir = new File("target/integrationTest");// ✅ creates a File reference called 'outputDir' pointing to target/integrationTest directory
        if (!outputDir.exists()) {
            outputDir.mkdirs(); // Actually creates folder.
        }

        // ✅ Define a file inside that path, and it gets created when we write data into it.
        outputFile = new File(outputDir, "integrationResult.txt"); //✅parent child-creates file inside specific folder
        //CalIntegrationResult.txt is the artifact we place in Target folder
        // ✅ Ensure the integration test output directory is created inside target for storing test artifacts
    }


    @Test(description = "Verify outfile is created and the content matches as expected", groups = {"integration"})
    public  void CalculatorIntegrationTest() throws IOException {

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
        System.out.println("Writing to: " + outputFile.getAbsolutePath());
        FileUtils.writeLines(outputFile,outputLines);
        //✅FileUtils is a utility library in Apache commons I/O which supports reading, writing, copying, and deleting files and directories operation.

        //✅Check whether the file is created or not using assertion
        Assert.assertTrue(outputFile.exists(),"CalIntegrationResult.txt should be present");

        // ✅Compare content of file with actual lines
        List<String> actualLines = FileUtils.readLines(outputFile, StandardCharsets.UTF_8);
        Assert.assertEquals(actualLines, outputLines,"mismatch found in lines");// comparing 2 lists

    }
}
