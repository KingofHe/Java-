package 正则表达式之捕获分组与非捕获分组;

public class 非捕获分组 {
    public static void main(String[] args) {
        //在正则表达式中对小括号中添加使用（?:xxx）、(?=xxx)、(?!xxx)时，小括号是不占组号的
        //举例：


        /*String str="我爱爱爱爱爱学学学学习习习";
        String regex="(?=.)\\1+";
        str.replaceAll(regex,"$1");           //-------会出现报错，因为正则表达式中无法找到第一组
        */
        //一般使用？：，?代表之前的全部内容，而：又决定是获取问号之前和冒号之后的所有数据



    }
}
