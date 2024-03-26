package 猴子吃桃;

public class main {
    public static void main(String[] args) {
        //有一个猴子，每天是吃剩余桃子个数的一半多一个
        //第十天的时候只剩1个，问最开始有多少个
        //已知第k天桃子的个数为1，求第n天一共有多少桃子
        System.out.println(getnum(20,2));
    }
    public static int getnum(int k,int n){
        if(n==k)
            return 1;
        return (getnum(k,n+1)+1)*2;
    }
}
