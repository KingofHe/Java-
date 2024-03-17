package 正则表达式在字符串方法中的使用;

public class main {
    public static void main(String[] args) {
        //matches     判断字符串是否满足正则表达式
        //public String replaceAll(String regex,String newstring)          按照正则表达式的规则进行替换
        //public String[] split(String regex)                       按照正则表达式进行分割




        //eg:张三gfs43256dgfgwr李四fdsgws354bfs34g1235345王五                    要求：将名字之间的字符替换成vs
        String str="张三gfs43256dgfgwr李四fdsgws354bfs34g1235345王五";
        String res1=str.replaceAll("[\\w&&[^_]]+","vs");
        System.out.println(res1);

        //要求：将三个名字切割出来      split返回的是字符串数组
        for(String s:str.split("[\\w&&[^_]]+")){         //这里传的参数是要切割掉的内容的正则表达式
            System.out.println(s);
        }
    }
}
