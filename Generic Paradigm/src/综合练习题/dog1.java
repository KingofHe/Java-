package 综合练习题;

public class dog1 extends dog{
    public dog1(String name,int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(getName()+getAge());
    }
}
