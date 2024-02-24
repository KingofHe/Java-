package stringmul;

import java.lang.reflect.Type;
import java.util.Scanner;

public class stringmulmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] earr={'0','1','2','3','4','5','6','7','8','9'};
        String num1,num2;
        System.out.println("请输入第一个非负整数：");
        num1=sc.next();
        System.out.println("请输入第二个非负整数：");
        num2=sc.next();
        char[] earr1=num1.toCharArray();
        char[] earr2=num2.toCharArray();
        int[] arr1=new int[num1.length()];
        int[] arr2=new int[num2.length()];
        int mul1,mul2;
        arr1=stringtoint(earr1,arr1);
        arr2=stringtoint(earr2,arr2);
        mul1=arrtoint(arr1);
        mul2=arrtoint(arr2);
        String str=String.valueOf(mul1*mul2);
        System.out.println(str);

    }
    public static int arrtoint(int[] arr){
        int result=0;
        result=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            result*=10;
            result+=arr[i+1];
        }
        return result;
    }
    public static int[] stringtoint(char[] earr,int[] arr){
        for (int i = 0; i < earr.length; i++) {
            switch (earr[i]){
                case '0'->arr[i]=0;
                case '1'->arr[i]=1;
                case '2'->arr[i]=2;
                case '3'->arr[i]=3;
                case '4'->arr[i]=4;
                case '5'->arr[i]=5;
                case '6'->arr[i]=6;
                case '7'->arr[i]=7;
                case '8'->arr[i]=8;
                case '9'->arr[i]=9;
                default-> System.out.println("错误");
            }
        }

        return arr;
    }


}
