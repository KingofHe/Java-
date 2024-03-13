package objectsANDobjects;

public class main3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //object是最顶级的父类，因为没有哪一个属性是所有类能共有的
        //因此object只有空参构造
        //这个类中有11个方法，
        //1.toString
        //任意创建的一个类中，默认继承object后均可调用toString方法，但打印出来的是地址
        //想打印子类中成员属性的话就必须重写toString方法

        //equals
        Student s1=new Student("张三",18);
        Student s2=new Student("张三",18);
        boolean re=s1.equals(s2);
        System.out.println(re);            //我想实现比较两个对象中的属性是否相同
        //s1、s2都是new出来的，s1、s2记录的地址肯定不同，直接使用这个方法会出错
        //想比较student类中的属性是否一致，就需要重写equals----alt+insert



        //protected void clone()能够实现将A的属性完全克隆给B
        //clone 方法受保护，创建的类student要调用之前必须重写
        Student s3=new Student("李四",21);
        Student s4=(Student) s3.clone();      //调用object方法克隆，还需要强转
        System.out.println(s4.getName()+s4.getAge());
        //1.重写clone方法   2.让JavaBean类实现Cloneable接口   3/创建原对象并调用clone

        //克隆的方式：
        //1.浅克隆：对于基本数据类型就直接拷贝，引用数据类型就完全拷贝地址
        //         这种拷贝若对拷贝结果s4中属性改变，那么s3中也会发生改变
        //2.深克隆：对基本数据类型就直接拷贝结果，对字符串（字符串的地址存放在串池中）就直接复用（
        //地址相同），对其他引用类数据就会先创建新的对象再拷贝
        //想实现深克隆时就需要方法重写或借用第三方工具类，因为object中为浅克隆
    }
}
