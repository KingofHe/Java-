package a3exerciseDemo03;

public class Adiminer extends Person{
    @Override
    public void show(){
        System.out.println("管理员的信息为："+getId()+getName());
    }
}
