package Set集合系列.HashSet;

import java.util.HashSet;

public class exercise {
    public static void main(String[] args) {
        //利用hashset去除重复对象
        student s1=new student("张三",22);
        student s2=new student("李四",22);
        student s3=new student("张三",22);
        student s4=new student("王五",23);
        HashSet<student> hs=new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));
        System.out.println(hs);
    }
}
