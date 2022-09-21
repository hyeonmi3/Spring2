package study.spring.projectBuild;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configuration1 {
    @Bean
    public Hello hello() {
        System.out.println("Hello() called");
        Hello hello = new Hello();
        hello.setPerson(mary());

        return hello;
    }

    @Bean
    public Person smith() {
        Person person = new Person();
        person.setName("Mr. smith");

        return person;
    }

    @Bean
    public Person mary() {
        Person person = new Person();
        person.setName("Ms. mary");

        return person;
    }
}
