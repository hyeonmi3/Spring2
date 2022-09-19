package d220831;

// IoC
import java.io.File;

public class Main {
    public static void main(String[] args) {
        HelloIF hello = new EnglishHello();

        Bower bower = new Bower();
        bower.execute(hello);
    }
}
