package wordlength;

import java.util.Scanner;

public class sentencelastlength {
    public static void main(String[] args) {
        String sentence;
        Scanner sc=new Scanner(System.in);
        System.out.println("请任意输入由多个单词以及空格组成的字符串");
        sentence=sc.nextLine();
        char[] earr=sentence.toCharArray();
        int len=earr.length;
        int num;
        for ( num=len-1 ; num >=0 ; num--) {
            if(earr[num]==' ')
                break;
        }
        int count=len-num-1;
        System.out.println(count);
    }
}
