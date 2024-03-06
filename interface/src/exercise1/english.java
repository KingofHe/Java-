package exercise1;

public interface english {
    public abstract void speakenglish();
    public default void show(){
        System.out.println("此处是接口默认方法---show");
    }
    public static void show2(){
        System.out.println("接口中的静态方法");
    }
}
