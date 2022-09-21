package study.spring.projectBuild;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application2 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Configuration1.class);

        Hello hello = context.getBean("hello", Hello.class);
        hello.sayHello();

        Hello hello2 = context.getBean("hello", Hello.class);
        hello2.sayHello();

        System.out.println(hello + " " + hello2);
    }
}
