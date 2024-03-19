package 正则表达式之捕获分组与非捕获分组;

public class 一般的捕获分组 {
    public static void main(String[] args) {
        //判断一个字符串的开始与结束是否相同，只考虑一个字符
        //举例：a123a    b456b   17891   &345&    a123b

        //判断一个字符的开始与结束是否相，考虑多个字符
        //举例：abc1234abc     123789123    &！@35@！&     abc123sgd

        //判断一个字符串的开始与结束是否相同，并且要求开始字符串内部也相同
        //举例：aaa1342aaa      bbb463356fdbbb    dddd4dsgse34dddd


        //如何确定分组：以左括号为基准，在上一个左括号的右边，在下一个左括号的左边的内容属于上一个左括号的组内


        String regex1="(.).+\\1";                  //\\1表示将第一组的内容拿出来在用一次
        System.out.println("a123a".matches(regex1));
        System.out.println("a123b".matches(regex1));

        String regex2="(.+).+\\1";
        System.out.println("abc1234abc".matches(regex2));
        System.out.println("abc123sgd".matches(regex2));

        String regex3="((.)\\2*).+\\1";          //*表示0次或多次出现
        System.out.println("aaa1342aaa".matches(regex3));
        System.out.println("daad4dsgse34dddd".matches(regex3));
    }
}
