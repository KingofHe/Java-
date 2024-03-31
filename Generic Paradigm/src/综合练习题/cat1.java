package 综合练习题;

public class cat1 extends cat{
    public cat1 (String name,int age){
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println(getName()+getAge());
    }

}
