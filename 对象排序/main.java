package 对象排序;

import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        //对四个对象排序，先按照年龄大小排序，其次是身高，最后是姓名
        person s1=new person("zahngsan",18,1.83);
        person s2=new person("lisi",18,1.85);
        person s3=new person("wangwu",19,1.78);
        person s4=new person("huagai",19,190);
        person[] arr={s1,s2,s3,s4};
        //利用arrays中的方法进行排序
        /*Arrays.sort(arr, new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                double temp=o1.getAge()-o2.getAge();
                temp=temp==0? o1.getHeight() -o2.getHeight():temp;           //三目操作符，？之前满足就返回第一个式子，否则返回第二个
                temp=temp==0?o1.getName().compareTo(o2.getName()):temp;
                if(temp>0)
                    return 1;
                else if (temp<0) {
                    return -1;
                }else return 0;
            }
        });
        System.out.println(Arrays.toString(arr));
        */
        //以下使用lambda表达式简化匿名内部类
        Arrays.sort(arr, (o1,  o2)-> {
            double temp=o1.getAge()-o2.getAge();
            temp=temp==0? o1.getHeight() -o2.getHeight():temp;           //三目操作符，？之前满足就返回第一个式子，否则返回第二个
            temp=temp==0?o1.getName().compareTo(o2.getName()):temp;
            if(temp>0)
                return 1;
            else if (temp<0) {
                return -1;
            }else return 0;
        });
        System.out.println(Arrays.toString(arr));
    }
}
