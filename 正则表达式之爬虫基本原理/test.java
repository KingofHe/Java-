package 正则表达式之爬虫基本原理;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        //题目：从下面的这一段句子中找出Javaxxx并打印出
        //Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，
        //下一个长期支持版本是Java17，相信在不久的将来Java17也会逐渐登上历史的舞台

//        String str="Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，"+
//                "下一个长期支持版本是Java17，相信在不久的将来Java17也会逐渐登上历史的舞台";
//
//        //Pattern  表示正则表达式
//        //获取pattern的对象
//        Pattern p=Pattern.compile("Java\\d{0,2}");
//        Matcher m=p.matcher(str);
//        //m是文本匹配器的对象，p表示字符串规则，str是大串
//        boolean re=true;
//        while(re==true) {
//            re = m.find();
//            //找的到返回true并在底层会记录符合规则的字串的首索引以及最后一个字符的索引+1，如第一个Java会记录0，4
//            //此时知识获取了一个，使用循环获取全部
//            String s = m.group();          //该方法是按照find记录的索引截取字符串
//            System.out.println(s);       //subString方法也是传递首索引和末索引加1来截取字符串}
//            //再一次使用find时，索引会从上一个被截取的字符串的后面开始
//        }
        String str="Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，"+
                "下一个长期支持版本是Java17，相信在不久的将来Java17也会逐渐登上历史的舞台";
        Pattern p=Pattern.compile("Java\\d{0,2}");
        Matcher m=p.matcher(str);
        while(m.find()){
            m.group();
            System.out.println(m.group());
        }


    }
}
