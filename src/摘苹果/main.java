package 摘苹果;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("请输入10个范围在100-200的整数");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("请输入一个范围在100-120的整数");
        int height=sc.nextInt();
        int count=getCount(arr,height);
        System.out.println(count);
    }
    public static int getCount(int[] arr,int height){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=height+30)
                count++;
        }
        return count;
    }
}
