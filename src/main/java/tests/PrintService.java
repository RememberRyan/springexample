package tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Ryan Alexander on 19/11/2018.
 */

// To mark it as a 'Bean' so it becomes one
@Service

// 'Component' does the same functionality, sort of... named differently for readability
// @Component

public class PrintService {

    public TestPrinter getTestPrinter() {
        return testPrinter;
    }

    public void setTestPrinter(TestPrinter testPrinter) {
        this.testPrinter = testPrinter;
    }

    public SuperTestPrinter getSuperTestPrinter() {
        return superTestPrinter;
    }

    public void setSuperTestPrinter(SuperTestPrinter superTestPrinter) {
        this.superTestPrinter = superTestPrinter;
    }

    // Imagine additional dependency, 'test printer'
    //@Autowired
    TestPrinter testPrinter;

    //@Autowired
    SuperTestPrinter superTestPrinter;

    public void printHello() {
        testPrinter.printSomethingElse();
        superTestPrinter.printSomethingSuper();
    }
}
