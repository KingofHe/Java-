package mess;

import java.util.Random;
import java.util.Scanner;

public class messarry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入任意一个字符串");
        String sr=sc.next();
        Random rd=new Random();
        char[] arry=sr.toCharArray();
        int i=0;
        char temp;
        int number;
        for ( i = 0; i < sr.length(); i++) {
            number=rd.nextInt(sr.length());
            if(i!=number){
                temp=arry[i];
                arry[i]=arry[number];
                arry[number]=temp;
            }
        }
        System.out.println("顺序打乱后的字符串为："+new String(arry));
    }
}
