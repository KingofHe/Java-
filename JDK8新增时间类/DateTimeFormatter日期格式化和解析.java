package JDK8新增时间类;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter日期格式化和解析 {
    public static void main(String[] args) {

        //ofPattern  方法是获取时间的格式
        //formate是将时间真正的进行格式化



        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss EE a");
        ZonedDateTime zdt= Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zdt2=ZonedDateTime.now();
        ZoneId zone=ZoneId.of("Asia/Shanghai");
        ZoneId zone1=ZoneId.systemDefault();
        System.out.println(dtf.format(zdt));
        System.out.println(dtf.format(zdt2));      //formate 参数是ZonedDateTime的时间对象


    }
}
