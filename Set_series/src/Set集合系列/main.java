package Set集合系列;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {
        //set是一个接口，创建对象时是需要创建接口的实现类
        Set<String> set=new HashSet<>();
        //set的元素不可重复，故在添加是返回的类型true表示可以添加，false表示不能添加，添加失败
        set.add("张三");
        set.add("wangwu");
        set.add("lisi");
        System.out.println(set);

        //迭代器遍历集合
        Iterator<String> it=set.iterator();      //创建迭代器对象，集合调用迭代器方法创建
        while (it.hasNext()){                    //使用迭代器方法hasNext来移动指针
            System.out.println(it.next());       //next用于获取元素，并将指针向下以为移动
        }

        //加强循环遍历
        for (String s : set) {
            System.out.println(s);
        }

        //利用lambda表达式遍历
        set.forEach( string -> System.out.println(string));
    }
}
