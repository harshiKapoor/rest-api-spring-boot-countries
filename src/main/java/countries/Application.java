package countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//this annotation starts our application
@SpringBootApplication

public class Application {
    public static void main(String args[]) {
        ApplicationContext ctx = SpringApplication.run(Application.class,args);
    }
}