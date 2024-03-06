package exercise1;

public class coachb extends coach{
    @Override
    public void teach() {
        System.out.println("篮球教练在教篮球");
    }

    public coachb(String name, int age) {
        super(name, age);
    }

    public coachb() {
    }
}
