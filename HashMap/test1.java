package HashMap;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class test1 {
    public static void main(String[] args) {
        studentfortest1 s1=new studentfortest1(18,"zhangsan");
        studentfortest1 s2=new studentfortest1(19,"lisi");
        studentfortest1 s3=new studentfortest1(18,"zhangsan");
        HashMap<studentfortest1,String> hm=new HashMap<>();
        hm.put(s1,"sichuan");
        hm.put(s2,"zhejiang");
        hm.put(s3,"sichuan");
        hm.forEach(new BiConsumer<studentfortest1, String>() {
            @Override
            public void accept(studentfortest1 studentfortest1, String string) {
                System.out.println(studentfortest1.getAge()+studentfortest1.getName()+string);
            }
        });
    }
}
