package exercise1;

public class pingc extends coach implements english{

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教乒乓");
    }

    @Override
    public void speakenglish() {
        System.out.println("乒乓球教练在说英语");
    }

    public pingc(String name, int age) {
        super(name, age);
    }

    public pingc() {
    }
}
