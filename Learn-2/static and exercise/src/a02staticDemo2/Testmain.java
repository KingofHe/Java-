package a02staticDemo2;

import java.util.ArrayList;

public class Testmain {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student("张三",23,"男");
        Student s2=new Student("李四",24,"男");
        Student s3=new Student("王五",25,"女");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int biggest=StudentUtil.getBage(list);
        System.out.println(biggest);
    }
}
