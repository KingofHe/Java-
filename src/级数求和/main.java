package 级数求和;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        int num=k;
        while(getSum(num)<=k){
            num++;
        }
        System.out.println(num);

    }
    public static double getSum(int n){
        double sum=0;
        for (double i = 1; i <= n; i++) {
            sum+=1/i;
        }
        return sum;
    }
}
