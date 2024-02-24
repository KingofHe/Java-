package romanumber;

import java.util.Scanner;
import java.util.concurrent.Exchanger;
import java.util.zip.CheckedInputStream;

public class romamain {
    public static void main(String[] args) {
        //题目：
        //要求键盘录入一个长度不大于9的字符串
        //要求检验录入字符串是否全是数字，不是的话提醒重新录入
        //将字符串中的阿拉伯数字转换为罗马数字并打印
        System.out.println("请输入一个长度不超过9的数字串");
        boolean re=false;
        while(re==false) {
            Scanner sc = new Scanner(System.in);
            String astr = sc.next();
            re = checkStr(astr);
            if(re==true){
                //以下代码实现罗马数字与阿拉伯数字的转换
                astr=Exchange(astr);
                System.out.println("转换后的罗马字符串为："+astr);
            }
            else if(re==false)
                System.out.println("字符串输入错误请重新输入");
        }


    }

    public static boolean checkStr(String str) {
        int len = str.length();
        char[] strArry = str.toCharArray();
        int i=0;
        for (i = 0; i <len ; i++) {
            if(strArry[i]<'0' || strArry[i]>'9')
                break;
        }
        if(len>9 || i!=len)
            return false;
        else return true;
    }
    public static String Exchange(String str){
        int len=str.length();
        char[] arry={'Ⅰ','Ⅱ','Ⅲ','Ⅳ','Ⅴ','Ⅵ','Ⅶ','Ⅷ','Ⅸ'};
        char[] arr=str.toCharArray();
        for (int i = 0; i <len ; i++) {
            switch(arr[i]){
                case '0':
                    arr[i]=' ';
                    break;
                case '1':
                    arr[i]='Ⅰ';
                    break;
                case '2':
                    arr[i]='Ⅱ';
                    break;
                case '3':
                    arr[i]='Ⅲ';
                    break;
                case '4':
                    arr[i]='Ⅳ';
                    break;
                case '5':
                    arr[i]='Ⅴ';
                    break;
                case '6':
                    arr[i]='Ⅵ';
                    break;
                case '7':
                    arr[i]='Ⅶ';
                    break;
                case '8':
                    arr[i]='Ⅷ';
                    break;
                case '9':
                    arr[i]='Ⅸ';
                    break;
                default:
                    break;
            }
        }
        return new String(arr);
    }
}

/*package romanumber;

import java.util.Scanner;

public class romamain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("请输入一个长度不超过9的数字串");
            input = sc.next();
        } while (!checkStr(input));

        String roman = exchange(input);
        System.out.println("转换后的罗马数字: " + roman);
    }

    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String exchange(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case '0':
                    arr[i] = ' '; // 如果不需要空格，可以移除这一行
                    break;
                case '1':
                    arr[i] = 'Ⅰ';
                    break;
                case '2':
                    arr[i] = 'Ⅱ';
                    break;
                case '3':
                    arr[i] = 'Ⅲ';
                    break;
                case '4':
                    arr[i] = 'Ⅳ';
                    break;
                case '5':
                    arr[i] = 'Ⅴ';
                    break;
                case '6':
                    arr[i] = 'Ⅵ';
                    break;
                case '7':
                    arr[i] = 'Ⅶ';
                    break;
                case '8':
                    arr[i] = 'Ⅷ';
                    break;
                case '9':
                    arr[i] = 'Ⅸ';
                    break;
            }
        }
        return new String(arr); // 将字符数组转换回字符串
    }
}*/
