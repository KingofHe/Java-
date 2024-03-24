package 判断二月的天数从而判断是否为闰年;

import java.util.Calendar;
import java.util.Scanner;

public class JDK7 {
    public static void main(String[] args) {
        //思路1.
        //例如判断2000年，可以将时间设置在这一年的3月1日，然后单独修改天数，向前推一天，判断是29还是28号
        //思路2：
        //将时间设置在2001年的1月1日，时间向前推一天，然后计算这一天是一年中的第365还是366天
        int year0=0;
        Scanner sc=new Scanner(System.in);
        year0=sc.nextInt();
        Calendar c=Calendar.getInstance();
        c.set(year0,2,1);                   //JDK7月份数的范围是0~11
        c.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));


        Calendar c1=Calendar.getInstance();
        c.set(year0+1,0,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }
}
