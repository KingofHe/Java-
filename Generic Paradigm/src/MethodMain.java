import java.util.ArrayList;

public class MethodMain {
    public static void main(String[] args) {
        //要求：定义一个工具类，类中定义一个静态方法addAll用来添加多个集合的元素
        ArrayList<String> list=new ArrayList<>();
        ListUnitle.addAll(list,"aaa","bbb","ccc");
        System.out.println(list);
    }
}
