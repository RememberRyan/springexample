import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tests.TestPrinter;

/**
 * Created by Ryan Alexander on 19/11/2018.
 */
public class MainXML {
    public static void main(String[] args) {
        // specifying configuration of bean
        AbstractApplicationContext context
                = new ClassPathXmlApplicationContext("application.xml");

        TestPrinter testPrinter= (TestPrinter) context.getBean("testPrinter");
        testPrinter.printSomethingElse();
        context.close();
    }
}
