import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import tests.PrintService;

/**
 * Created by Ryan Alexander on 19/11/2018.
 */

@Configuration

// Where 'Beans' location should be
@ComponentScan (value="tests")
public class Main {

    public static void main(String[] args) {
        // points to where the configuration is 'Main.class'
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        PrintService printService = (PrintService) applicationContext.getBean("printService");
        printService.printHello();
        applicationContext.close();
    }
}
