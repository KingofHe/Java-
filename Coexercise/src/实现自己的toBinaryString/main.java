package 实现自己的toBinaryString;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String re=toBinaryString(number);
        System.out.println(re);
        System.out.println(Integer.toBinaryString(number));
    }
    public static String toBinaryString(int num){
        StringBuilder sb=new StringBuilder();
        while(true){
            if(num==0)
                break;
            int c=num%2;
            num/=2;
            sb.insert(0,c);
        }
        return sb.toString();
    }
}
