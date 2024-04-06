package Map接口;

import java.util.HashMap;
import java.util.Map;

public class 常用方法 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        //Map是一个接口，不能直接创建对象，要创建它的实现类的对象
        //Map的第一个参数称为键，第二个称为值，二者合称键值对，其中键不可重复，值可重复

        //put方法，作用：一是放入键值对，二是会覆盖键相同的键值对的值，三是会返回已有的重复键值对的值
        map.put(1,"张三");
        map.put(2,"zhangsan");
        map.put(3,"lisi");
        String s=map.put(2,"wangwu");
        System.out.println(map);
        System.out.println(s);

        //clear 清除       contains  判断是否包含
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("lisi"));
        map.clear();
        System.out.println(map);
    }
}
