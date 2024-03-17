package 正则表达式之爬虫基本原理;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 贪婪爬取和非贪婪爬取 {
    public static void main(String[] args) {
        // Java自从95年问世以来，aaabbbbbbbbbbabbabbbbbbabbbbabbbbbbabbbbbbbbbbbbbbbb
        // 经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，
        //下一个长期支持版本是Java17，相信在不久的将来Java17也会逐渐登上历史的舞台


        //贪婪爬取：ab+的形式，即尽可能地多获取数据  如上式中想获取ab+（b的个数为1或多个），那么贪婪爬取下为abbbbbbbbbbbbbbbbb
        //非贪婪爬取：尽可能少的获取数据，获取为ab
        //贪婪爬取结尾为*或+，而非贪婪爬取只需要再加一个？就行，而Java中默认是贪婪爬取

        String  str="Java自从95年问世以来，aaabbbbbbbbbbabbabbbbbbabbbbabbbbbbabbbbbbbbbbbbbbbb\n" +
                "经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，\n" +
                "下一个长期支持版本是Java17，相信在不久的将来Java17也会逐渐登上历史的舞台";
        Pattern p=Pattern.compile("ab+");
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
        System.out.println("-------------------------------------------------------------------");
        Pattern p1=Pattern.compile("ab+?");
        Matcher m1=p1.matcher(str);
        while(m1.find()){
            System.out.println(m1.group());
        }
    }
}
