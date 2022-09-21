package study.spring.projectBuild;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Application3 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Configuration3.class);

        Hello hello = context.getBean("Hello", Hello.class);
        hello.sayHello();
    }
}
