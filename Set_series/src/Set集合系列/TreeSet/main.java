package Set集合系列.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {
        //TreeSet底层是利用的的红黑树原理，而不用哈希表，因此不需要重写hashcode方法，但是要重写compareto方法
        //从而指定比较规则



        //treeset在取出数据时会默认排序，从小到大
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            ts.add(i);
        }
        System.out.println(ts);

        Iterator it = ts.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        for (Integer t : ts) {
            System.out.println(t);
        }

        ts.forEach(integer -> System.out.println(ts));


        //对字符类型那么就按照在ASCII表中的值，升序排列
        //对字符串类型，是依次比较每个字符，只要有一个字符能确定大小就结束比较
        //如：aba，aaa，ab的排列顺序为：aaa，ab，aba


        //当数据类型是自定义对象时   需要自己指定比较规则
        //指定的方式：方式1.自定义类连接接口comparable，并重写其中的方法并定义排序规则
        //方式2.比较器排序    在创建集合对象的时候传递比较器comparator指定规则
        //一般默认使用第一种方式


        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("wangwu", 24);
        Student s3 = new Student("lisi", 25);
        TreeSet<Student> st = new TreeSet<>();
        st.add(s1);
        st.add(s2);
        st.add(s3);
        System.out.println(st);

        //comparator也是一个接口，因此在使用时是创建的他的实现类对象，这里使用的是匿名内部类
        //当集合利用空参构造创建的时候就是按照默认排序，
        //使用比较器构造的时候就能自定义规则
        TreeSet<String> ts3=new TreeSet<>(( o1,  o2)-> {
                int i=o1.length()-o2.length();
                i=i==0?o1.compareTo(o2):i;
                //实现的功能：先比较两个字符串的长度
                //长度按照由小到大的顺序排列
                //如果长度相同在按照字母顺序排列，即默认排序
                return i;
                //o1是当前要添加的元素    o2是红黑树中已经存在的元素
            }
        );
        ts3.add("abcd");
        ts3.add("ab");
        ts3.add("cd");
        ts3.add("c");
        System.out.println(ts3);

    }

}
