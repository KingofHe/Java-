package 继承与通配符;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //泛型不具备继承性，但是数据是具有继承性的
        //解释：在集合中如果已经确定了数据类型，如确定了引用数据类型为Ye，那么即使有Ye的子类
        //Fu继承于Ye类，在实际使用集合时仍然不能实现传Fu类型的数据
        ArrayList<Fu> list1=new ArrayList<>();
        ArrayList<Ye> list2=new ArrayList<>();
        method(list1);
        //method(list);               //这里传参就会报错

        //数据具有继承性：即我可以在Ye中去添加Fu类型的数据
    }
    public static void method(ArrayList<Fu> list){
    //泛型方法可以写成  public static void method(ArrayList<?> list){}
    //与public static<E> void method(ArrayList<E> list){}效果是相同的
    }
}

class Ye{
}
class Fu extends Ye{

}
