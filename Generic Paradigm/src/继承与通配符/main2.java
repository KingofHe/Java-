package 继承与通配符;

import java.util.ArrayList;

public class main2 {
    public static void main(String[] args) {
        //泛型方法有一个小弊端，因为他可以接收任意类型的集合
        //但是现在我们想实现，一个方法能够接收不同类型的集合，但是这些集合有一个要求，就是数据类型时、
        // 具有继承性的JavaBean类
        //如此便出现了通配符

        ArrayList<Ye2> list=new ArrayList<>();
        ArrayList<Fu2> list2=new ArrayList<>();
        ArrayList<Zi2> list3=new ArrayList<>();
        method(list);
        method(list2);
        method(list3);





        //? extends E表示可以传递所有的E及继承于他的子类
        //? super E表示可以传递E和E的所有父类

    }
    public static void method(ArrayList<? extends Ye2> list){

    }
}
class Ye2{

}
class Fu2 extends Ye2{

}
class Zi2 extends Fu2{

}
class student{

}
