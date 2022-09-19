package d220824;

public class SayHello extends NameJob {

    public SayHello() {
        super();
    }

    @Override
    protected void doJob(String name) {
        System.out.printf("안녕하세요. %s님\n", name);
    }

    public static void main(String[] args) {
        SayHello sayHello = new SayHello();
        sayHello.execute();
    }
}