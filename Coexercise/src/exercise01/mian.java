package exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
        //向集合中添加整数，直到所有数的和超过200
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        while (true){
            System.out.println("请输入整数");
            Scanner sc=new Scanner(System.in);
            Integer num=sc.nextInt();
            list.add(num);
            sum+=num;
            if(sum>200){
                System.out.println("数据之和超过200，结束录入");
                break;
            }


        }
    }
}
