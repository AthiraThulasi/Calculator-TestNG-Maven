package com.calculatorIntegrationTest;


import org.apache.commons.io.FileUtils;
import org.athira.Calculator;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

// Purpose - To dump the result of each operation into a file
// We will cross check if the file is getting created(AAssertion)
// Cross check if the right content is written in the file(Assertion)
public class CalculatorIT {
    @Test
    public  void CalculatorIntegrationTest() throws IOException {
        Calculator cal = new Calculator();
        File outputFile = new File("CalIntegrationResult.txt");
        double addResult = cal.add(10,10);
        double subtractResult = cal.subtract(100,10);
        double multiplyResult = cal.multiply(20,10);
        double divideResult = cal.divide(100,10);

        List<String> outputLines = Arrays.asList(
                String.valueOf(addResult),
                String.valueOf(subtractResult),
                String.valueOf(multiplyResult),
                String.valueOf(divideResult)
        );
        FileUtils.writeLines(outputFile,outputLines);

    }
}
