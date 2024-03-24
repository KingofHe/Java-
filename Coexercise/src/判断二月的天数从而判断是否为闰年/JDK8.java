package 判断二月的天数从而判断是否为闰年;

import java.time.LocalDate;

public class JDK8 {
    public static void main(String[] args) {
        LocalDate d=LocalDate.of(2000,3,1);       //JDK8之后月份的范围又是1~12了
        LocalDate d1=d.minusDays(1);
        System.out.println(d1);

        LocalDate d2=LocalDate.of(2001,1,1);
        LocalDate d3=d2.minusDays(1);
        System.out.println(d3.getDayOfYear());

        //除此之外还有写好的判断是否是闰年的方法
        LocalDate d4=LocalDate.of(2000,3,1);
        System.out.println(d4.isLeapYear());      //是闰年就返回true
    }
}
