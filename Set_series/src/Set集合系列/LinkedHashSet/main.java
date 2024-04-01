package Set集合系列.LinkedHashSet;

import Set集合系列.HashSet.student;

import java.util.LinkedHashSet;

public class main {
    public static void main(String[] args) {
        //这个类是继承于hashset
        //LinkedHashSet能够保证存入与取出的数据是有序的
        //底层原理：LinkedHashSet在底层除了使用到了链表、数组、红黑树，还使用到了双向链表
        //双向链表是按照数据存入的顺序依次连接的，在遍历时也会通过双向链表来遍历获取元素
        student s1=new student("张三",22);
        student s2=new student("李四",22);
        student s3=new student("张三",22);
        student s4=new student("王五",23);
        LinkedHashSet<student> lhs=new LinkedHashSet<>();
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        System.out.println(lhs);
    }
}
