package a1exerciseDemo01;

public class Cat extends Animal{
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫眯着眼睛侧着头吃"+something);
    }
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
