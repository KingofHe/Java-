package 综合练习题;

public class dog2 extends dog{
    public dog2(String name,int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(getName()+getAge());
    }
}
