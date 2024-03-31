import java.util.ArrayList;

public class InterfaceMain {
    public static void main(String[] args) {
        //泛型接口也是接口名之后加泛型
        //使用方式：1.实现类给出具体的类型     例如：myarraylist2
        //         2.实现类延续泛型，创建实现类时再确定数据类型     例如：myarraylist3
        MyArrayList2 list=new MyArrayList2();
        list.add("aaaa");


        MyArrayList3<String> list1=new MyArrayList3<>();
        list1.add("ccc");
        System.out.println(list.get(0));
        System.out.println(list1.get(0));

        ArrayList<String> list3=new ArrayList<>();
        list3.add("aaa");
        System.out.println(list3);

    }
}
