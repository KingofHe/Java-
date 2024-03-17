package 正则表达式之爬虫基本原理;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 有条件的爬取 {
    public static void main(String[] args) {
        //对
        // Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，
        //下一个长期支持版本是Java17，相信在不久的将来Java17也会逐渐登上历史的舞台
        //这段句子做爬取，
        //要求1：爬取版本号为8、11、17，但只要Java不要版本号
        //要求2：爬取版本为8、11、17的版本
        //要求3：爬取除了8、11、17版本号的Java

        String str="Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，\n" +
                "下一个长期支持版本是Java17，相信在不久的将来Java17也会逐渐登上历史的舞台";

        //1.
        String regex1="(?i)java(?=8|11|17)";    //?占位符表示Java，=8|11|17表示Java后面跟的是三者之一,=只获取前面的值
        Pattern p=Pattern.compile(regex1);
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
        System.out.println("------------------------------------------------------------------");
        String regex2="(?i)java(?:8|11|17)";   //这里的正则表达式还能写成Java(8|11|17)
        Pattern p1=Pattern.compile(regex2);
        Matcher m1=p.matcher(str);
        while(m1.find()){
            System.out.println(m1.group());
        }
        System.out.println("------------------------------------------------------------------");
        String regex3="((?i)java)(?!8|11|17)";   //这里的正则表达式还能写成Java(！8|11|17)
        Pattern p3=Pattern.compile(regex3);
        Matcher m3=p3.matcher(str);
        while(m3.find()){
            System.out.println(m3.group());
        }
    }
}
