package JDK8新增时间类;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Instant时间戳 {
    public static void main(String[] args) {
//        Instant：时间戳
//        方法：  static Instant now();   获取当前时间---国际标准时间，北京时间需要增加八小时
//        static Instant ofXxxx (long epochMilli);      根据（秒/毫秒/纳秒）获取instant的对象
//        ZoneDateTime atZone(ZoneId zone)              指定时区
//        isXxxx                 判断
//        minusXxxx              instant对象的时间向前减少指定时间，这种减少是新创建一个instant的对象存放减少结果，而调用
//        方法的对象本身不会发生改变      plusXxxx 同理，不过是变成了时间的增加

        Instant instent=Instant.now();
        System.out.println(instent);

        Instant instant=Instant.ofEpochMilli(0L);
        System.out.println(instant);
        instant=Instant.ofEpochSecond(1333);
        System.out.println(instant);
        instant=Instant.ofEpochSecond(133,2000);
        //这个静态方法是返回计算求和后的标准时间    秒+纳秒
        System.out.println(instant);


        ZonedDateTime time=instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);                //获取指定时区的时间

        Instant t1=Instant.ofEpochSecond(1000);
        Instant t2=Instant.ofEpochMilli(10348);
        boolean re=t1.isBefore(t2);
        //isXxxx 用于判断instant对象的时间先后，正确返回true，否则返回false
        System.out.println(re);
        re=t1.isAfter(t2);
        System.out.println(re);


        Instant t4=Instant.ofEpochSecond(300000L);
        Instant t5=t4.minusSeconds(100);
        System.out.println(t4);
        System.out.println(t5);
        Instant t6=Instant.ofEpochSecond(1008611L);
        Instant t7=t6.plusSeconds(1L);
        System.out.println(t6);
        System.out.println(t7);

    }
}
