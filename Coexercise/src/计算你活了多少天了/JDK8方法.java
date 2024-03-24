package 计算你活了多少天了;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JDK8方法 {
    public static void main(String[] args) {
        //主要有三个类可以计算时间间隔
        //period  偏重于计算几年几月几天的间隔      duration  偏重于计算几时几分几秒的时间间隔    chronounit   兼具二者的功能
        LocalDate bir=LocalDate.of(2005,3,25);
        LocalDate now=LocalDate.now();
        long days=ChronoUnit.DAYS.between(bir,now);
        System.out.println(days);
    }
}
