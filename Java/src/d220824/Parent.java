package d220824;

import java.util.Scanner;

public class Parent {
    Scanner scanner = new Scanner(System.in);

    public  void execute() {
        while (true) {
            String name = inputName();

            if ("quit".equals(name)) {
                break;
            }

            doJob(name);
        }

        scanner.close();
    }

    protected String inputName() {
        String name = scanner.nextLine();
        return name;
    }

    protected void doJob(String name) {
        System.out.printf("안녕하세요. %s님\n", name);
    }
}