package Set集合系列.HashSet;

public class main {
    public static void main(String[] args) {
        /*
        HashSet在底层采用的是哈希表存储数据
        哈希表的组成：数组+链表+红黑树
         */





        /*哈希值:对象的整数表现形式，对每个对象计算hash值是通过定义在object类下的方法hashcode
        1.当hashcode方法没有重写时，哈希值的计算是要通过地址值得到的，不同对象的哈希值不同
        2.在类中进行重写之后，相同属性的对象的哈希值是相同的
        3.可能会出现哈希碰撞，即不同地址不同属性的对象的哈希值可能相同
         */
        student s1=new student("张三",22);
        student s2=new student("李四",22);
        student s3=new student("张三",22);
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
