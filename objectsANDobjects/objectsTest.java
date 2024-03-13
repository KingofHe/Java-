package objectsANDobjects;

import java.util.Objects;

public class objectsTest {
    public static void main(String[] args) {
        //objects是一个工具类
        //equals（object a,object b）会先判断a、b是否为空（null）
        ObjectsStudent o1=new ObjectsStudent("张三",28);
        ObjectsStudent o2=new ObjectsStudent("李四",32);
        ObjectsStudent o3=null;
        ObjectsStudent o4=new ObjectsStudent("张三",28);
        boolean re= Objects.equals(o1,o2);
        System.out.println(re);
        re= Objects.equals(o1,o3);
        System.out.println(re);
        re= Objects.equals(o3,o2);
        System.out.println(re);
        re= Objects.equals(o1,o4);
        System.out.println(re);

    }
}
