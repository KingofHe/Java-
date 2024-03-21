package JDK8新增时间类;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

public class Calendar日历对象 {
    public static void main(String[] args) {
        //有三个类：LocalDate、
        //静态方法now用于获取当前时间下的calendar对象
        //静态方法of用于获取指定时间的calendar对象
        //get开头的方法用于获取指定字段的数据，获取年、月、日、小时等指定时间的对象
        //with开头的方法------用于修改时间系列
        //minus开头的方法------减少时间系列的方法     plus开头-------增加时间系列的方法
        //isbefore、isafter  用于比较两个时间
        LocalDate ld=LocalDate.now();            //localdate 只包括年月日
        System.out.println(ld.getYear());
        Month month=ld.getMonth();                 //localdate方法中调用的getmonth方法获取的是month的对象
        System.out.println(ld.getMonthValue());     //这个方法是获取阿拉伯数字的月份
        System.out.println(month);
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfYear());

        LocalTime lt=LocalTime.now();

    }
}
