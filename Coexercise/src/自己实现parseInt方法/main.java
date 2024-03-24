package 自己实现parseInt方法;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //实现parseInt方法，将字符串数据类型转换为整形数据，要求录入的只能是数字，且首位不能为0，最多不超过10位
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个不超过10位数的正整数");
        String snum=sc.nextLine();
        int re=parseInt(snum);
        if(re==-1)
            System.out.println("输入数据非法");
        else{
            System.out.println(re);
        }
    }
    public static int parseInt(String s){
        for(char c:s.toCharArray()){
            if(c<'0' || c>'9')
                return -1;
        }
        char[] cstr=s.toCharArray();
        if(cstr[0]=='0')
            return -1;
        int re=0;
        for (int i = s.length()-1; i >=0; i--) {
            int c=s.charAt(i)-'0';
            re+=c*Math.pow(10,s.length()-1-i);
        }
        return re;
    }
}
