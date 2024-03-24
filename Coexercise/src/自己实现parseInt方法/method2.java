package 自己实现parseInt方法;

import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int re=parseInt(str);
        if(re==-1){
            System.out.println("数据非法");
        }else{
            System.out.println(re);
        }
    }
    public static int parseInt(String s){
        if(s.matches("[1-9]\\d{0,9}")==false){
            return -1;
        }
        int re=0;
        for (int i = 0; i < s.length(); i++) {
            int c=s.charAt(i)-'0';
            re*=10;
            re+=c;
        }
        return re;
    }
}
