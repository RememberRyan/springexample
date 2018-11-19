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

    // Imagine additional dependency, 'test printer'
    @Autowired
    TestPrinter testPrinter;

    public void printHello() {
        testPrinter.printSomethingElse();
    }
}
