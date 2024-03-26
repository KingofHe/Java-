package 爬楼梯;

public class main {
    public static void main(String[] args) {
        //有一个20界的楼梯，小明一次只能迈一阶或者两阶，问一共有多少种上楼梯的方法
        //对20阶，存在方法Fn（20），不难发现Fn(20)=Fn(19)+Fn(18);这是一步最多两级的情况
        //推广到n级，一次上最多2级
        //当一次最多级数改变的时候step（1）,step(2)~step(k)不同
        System.out.println(step(20));
    }
    public static int step(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        return step(n-1)+step(n-2);
    }
}
