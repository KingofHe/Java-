package Map接口;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class 遍历方式 {
    public static void main(String[] args) {
        //遍历方式1.首先遍历双列集合的键值，将键值放入set集合中，再用k键依次获取值
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"zhangsan");
        m.put(2,"lisi");
        m.put(3,"wangwu");
        m.put(4,"zhouliu");
        Set<Integer> me=m.keySet();
        for (int key:me){
            String s=m.get(key);
            System.out.println(key+"="+s);
        }
        Iterator<Integer> id=me.iterator();
        while(id.hasNext()){
            int num=id.next();
            System.out.println(num+"="+m.get(num));
        }

        me.forEach(integer ->System.out.println(integer+"="+m.get(integer)));


        System.out.println("------------------------------------");
        //遍历方式。通过键值对对象来遍历
        Set<Map.Entry<Integer,String>> entrys=m.entrySet();
        for (Map.Entry<Integer,String> em:entrys){
            em.getKey();
            em.getValue();
            System.out.println(em.getKey()+"="+em.getValue());
        }
        Iterator<Map.Entry<Integer,String>> id2=entrys.iterator();
        while(id2.hasNext()){
            Map.Entry<Integer,String> num=id2.next();
            System.out.println(num.getKey()+"="+num.getValue());
        }
        entrys.forEach(integerStringEntry->
                System.out.println(integerStringEntry.getKey()+"="+integerStringEntry.getValue()));


        //遍历方式3.利用lambda表达式遍历
        m.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String string) {
                System.out.println(integer+"="+string);
            }
        });
        m.forEach((integer,string)-> System.out.println(integer+"="+string));
    }
}
