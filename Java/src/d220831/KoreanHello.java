package d220831;

public class KoreanHello implements HelloIF {

    protected String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.printf("안녕하세요. %s\n", this.name);
    }
}
