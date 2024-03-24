package 计算你活了多少天了;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JDK7方法 {
    public static void main(String[] args) throws ParseException {
        String birthday="2005年3月25日";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = sdf.parse(birthday);
        long birthdayTime=parse.getTime();
        //获取当前时间
        long todayTime=System.currentTimeMillis();

        long time=todayTime-birthdayTime;
        time=time/1000/60/60/24;
        System.out.println("您已出生了"+time+"天了");
    }
}
