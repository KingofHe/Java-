package JDK7之前的时间相关类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 三种DateANDSimpleDateFormateANDCalendar {
    public static void main(String[] args) throws ParseException {
        //1.Date
        java.util.Date d1=new java.util.Date();        //使用空参构造时表示获取此时的系统时间
        System.out.println(d1);      //Tue Mar 19 14:56:23 CST 2024   其中CST表示是原子钟标准下的计时时间


        //2.SimpleDateFormate
        //SimpleDateFormate类的作用     1.格式化时间变为xxxx/xx/xx等的形式     2.解析   可以将字符串记录下的时间解析为Date对象
        //然后可以通过解析两个时间从而获取两个时间的间隔
        //指定时间的模式时y表示年，M表示月，d表示日，H表示时，m表示分钟，s表示秒
        //例如：2020-02-16 18：54：36         yyyy-MM-dd HH：mm：ss             可以到API中通过SimpleDateFormate查找



        // public SimpleDateFormate()   默认格式         public SimpleDateFormate(String pattern)        指定格式
        //public final String formate(Date date)          格式化    日期----字符串
        //public Date parse(String source)                解析      字符串--->日期对象
        /*java.util.Date date=new java.util.Date();
        SimpleDateFormat sdf1=new SimpleDateFormat();
        String str=sdf1.format(date);
        System.out.println(str);

        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss a E");
        str=sdf2.format(date);
        System.out.println(str);*/


        String pattern="2024-03-25 00:00:00";
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date2=sdf3.parse(pattern);
        System.out.println(date2.getTime());





        //3.Calendar是一个抽象类，不能直接创建对象，通过方法获取对象
        Calendar c=Calendar.getInstance();
        //这种方法获取的月份的范围是1~11，而获取的星期序号1代表星期天，7代表周六
        //System.out.println(c);
        //获取实例时是根据时区获取时间，并将年月日等时间信息存入一个数组中
        //三个重要的方法：
        /*
        public int get(int field)        获取字段中某个字段的信息
        public void set(int field,int value)        修改日历中的某个字符端的信息
        public  void add(int field,int account)     增加或减少某个字段中的数据大小
         索引序号与含义：   0---纪元（一般用不上）     1--年     2--一年中的第几个月（0~11）     3----一年中的第几周
         4----一个月中的第几周       5----一个月中的第几天   .......一共有17的字段，索引为0~16
         */
        Date date=new Date(0L);
        c.setTime(date);
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;                 //java底层将这17个索引定义成了常量
        int date0=c.get(Calendar.DAY_OF_MONTH);    //等价于      DAY_OF_MONTH
        System.out.println("year"+year+"\tmonth"+month+"\tdate"+date0);

        c.set(Calendar.YEAR,2024);
        year=c.get(Calendar.YEAR);
        System.out.println("year"+year+"\tmonth"+month+"\tdate"+date0);
        c.set(Calendar.MONTH,34);     //当月份超出索引11时，就会自动增加年份
        month=c.get(Calendar.MONTH)+1;
        System.out.println("year"+year+"\tmonth"+month+"\tdate"+date0);

        c.add(Calendar.MONTH,33);
        year=c.get(Calendar.YEAR);
        month=c.get(Calendar.MONTH);
        System.out.println("year"+year+"\tmonth"+month+"\tdate"+date0);
    }
}
