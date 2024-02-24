package checkcode;

import java.util.Random;

public class checkcodemain {
    public static void main(String[] args) {
        /*生成一个五位验证码，其中包含一个数字和四个字母，位置随机*/
        //首先可以将所有大小写字母全部放入一个字符数组中
        //再随机产生一个数字放入五位数组中
        //最后对五位数组进行随机打乱
        char[] earr=new char[52];
        char[] code=new char[5];
        char[] it={'0','1','2','3','4','5','6','7','8','9'};
        earr=reserveaz(earr);
        //System.out.println(new String(earr));
        code=produceaz(code,earr);
        //System.out.println(new String(code));
        Random rd=new Random();
        int number=rd.nextInt(10);
        code[4]=it[number];
        code=mess(code);
        System.out.println("验证码是："+new String(code));
    }

    public static char[] mess(char[] code){
        Random rd=new Random();
        for (int i = 0; i < code.length; i++) {
            int index=rd.nextInt(code.length);
            char temp;
            if(i!=index){
                temp=code[i];
                code[i]=code[index];
                code[index]=temp;
            }
        }
        return code;
    }
    public static char[] produceaz(char[] arr1,char[] arr2){
        Random rd=new Random();
        for (int i = 0; i < 4; i++) {
            int index=rd.nextInt(arr2.length);
            arr1[i]=arr2[index];
        }
        return arr1;
    }
    public static char[] reserveaz(char[] arr){
        int sy=0;
        for(char c='a';c<='z';c++){
            arr[sy]=c;
            sy++;
        }
        for(char c='A';c<='Z';c++){
            arr[sy]=c;
            sy++;
        }
        return arr;
    }
}
