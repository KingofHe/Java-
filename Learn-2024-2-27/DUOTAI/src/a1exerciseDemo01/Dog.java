package a1exerciseDemo01;

public class Dog extends Animal{
    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗抱住"+something+"猛吃");
    }
    public void lookhome(){
        System.out.println("狗在看家");
    }
}
