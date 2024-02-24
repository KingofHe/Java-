package leftroating;

import java.util.Scanner;

public class leftmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串一");
        String str1=sc.next();
        System.out.println("请输入字符串二");
        String str2=sc.next();
        int len1=str1.length();
        int len2=str2.length();
        if(len1!=len2) {
            System.out.println("字符串二不是字符串一的一个左旋字符串");
            return;
        }
        int i;
        for ( i = 0; i < len1; i++) {
            if(str2.equals(str1)==true) {
                System.out.println("字符串二是字符串一的一个左旋字符串");
                return;
            }
            str1=leftmove1(str1);
        }
        if(i==len1)
            System.out.println("字符串二不是字符串一的一个左旋字符串");
    }
    public static String leftmove1(String str){
        char[] arr=str.toCharArray();
        int len=str.length();
        char temp;
        temp=arr[0];
        for (int i = 0; i < len-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[len-1]=temp;
        return new String(arr);
        //return arr.toString();
    }
}
