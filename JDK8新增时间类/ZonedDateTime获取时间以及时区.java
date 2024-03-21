package JDK8新增时间类;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime获取时间以及时区 {
    public static void main(String[] args) {

        //JDK8的时间对象都是不可变的，每一次的更改数据实际上是重新创建了一个新的对象


        //对象通过方法获取
        //now() 获取系统时间和时区，ofXxxx获取指定时间的ZoneDateTime对象
        ZonedDateTime zdt1=ZonedDateTime.now();
        System.out.println(zdt1);
        ZonedDateTime zdt2=ZonedDateTime.of(2024,3,21,14,59,35,00, ZoneId.of("Asia/Shanghai"));
        System.out.println(zdt2);
        //withXxxx    修改时间系列的方法        //其他时间与被修改的对象完全一致
        ZonedDateTime zdt3=zdt2.withYear(2023);
        System.out.println(zdt3);
        //minusXxxx     减少时间      plusXxxx增加时间
        ZonedDateTime zdt4=zdt3.minusYears(2);
        System.out.println(zdt4);

    }
}
