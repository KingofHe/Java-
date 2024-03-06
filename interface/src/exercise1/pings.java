package exercise1;

public class pings extends sporter implements english{

    @Override
    public void speakenglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员在学习乒乓");

    }

    public pings(String name, int age) {
        super(name, age);
    }

    public pings() {
    }
    public static void show2(){
        System.out.println("这是Java类中的静态方法");
    }
}
