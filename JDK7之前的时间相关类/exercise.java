package JDK7之前的时间相关类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exercise {
    public static void main(String[] args) throws ParseException {
        //将当前的时间表示为格式2024-3-19并转换为2024年3月19日再输出

        /*Date date=new Date();        //获取了当前时间
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String re=sdf1.format(date);
        System.out.println(re);
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1=sdf2.parse(re);
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String re2=sdf3.format(date1);
        System.out.println(re2);
        */


        //第二个练习    判断某一时刻是否在目标时间段内      eg：目标时间段：2024-3-19 15：30：00---2024-3-19 15：40：00
        //时刻取当前时间，或者任一输入     下面以当前时间为例子
        Date date=new Date();
        String time1="2024-3-19 15:30:00";
        String time2="2024-3-19 15:40:00";
        //以下实现功能：将这两个时间解析为date的对象，并通过做减法判断当前时间是否在目标时间段内
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1=sdf.parse(time1);
        Date date2=sdf.parse(time2);
        long t1=date.getTime();
        long t2=date1.getTime();
        long t3=date2.getTime();
        if(t1>=t2 && t1<=t3)
            System.out.println(true);
        else System.out.println(false);
    }
}
