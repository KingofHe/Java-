package 正则表达式之爬虫基本原理;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercise {
    public static void main(String[] args) {
        /*需求：把下面文本中的座机电话、邮箱、手机号、热线都爬出来
        来学Java：
        手机号：15983776477，15760565577
        或者联系邮箱228620857@163.com
        座机电话：01036517895
        邮箱：15760165577@163.com
        热线电话：400-618-9090
         */
        //首先把四个信息的正则表达式写出来
        String regex1="1[3-9]\\d{9}";
        String regex2="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        String regex3="0\\d{2,3}-?[1-9]\\d{4,9}";
        String regex4="[1-9]\\d{2}-?\\d{3}-?\\d{4}";
        String regex="(1[3-9]\\d{9})|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})|(0\\d{2,3}-?[1-9]\\d{4,9})|([1-9]\\d{2}-?\\d{3}-?\\d{4})";
        String str="来学Java：\n" +
                "        手机号：15983776477，15760565577\n" +
                "        或者联系邮箱228620857@163.com\n" +
                "        座机电话：01036517895\n" +
                "        邮箱：15760165577@163.com\n" +
                "        热线电话：400-618-9090";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }

    }
}
