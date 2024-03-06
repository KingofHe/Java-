package exercise1;

public class baskets extends sporter{

    @Override
    public void learn() {
        System.out.println("篮球运动员在学习篮球");
    }

    public baskets(String name, int age) {
        super(name, age);
    }

    public baskets() {
    }
}
