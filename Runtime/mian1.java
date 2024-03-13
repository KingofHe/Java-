package Runtime;

import java.io.IOException;

public class mian1 {
    public static void main(String[] args) throws IOException {
        //Runtime表示的是虚拟机的运行环境，因此空参构造有private修饰
        //Runtime是一个非静态的类，需要通过创建对象才能使用其中的方法
        //但注意的是：创建Runtime的对象时不能使用new直接创建
        // 因为在底层代码中，Runtime的空参构造是用private修饰的（可以ctrl+B跟进查看底层代码）
        //创建对象需要调用getRuntime方法，然而这个方法本身就创建了对象，并且使用final修饰
        //所以Runtime创建的所有对象的地址是相同的》》》因为虚拟机就一个

        //创建对象
        //Runtime r=Runtime.getRuntime();


        //结束虚拟机运行   exit()
        //r.exit(0);
        //System.out.println("check may i ran");

        //availableProcessors()获取CPU线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        //maxMemory获取jvm所能使用的最大内存
        //totalMemory---jvm已经获取的内存的大小
        //freeMemory----剩余内存大小
        //单位都是字节
        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());

        //exce是使用cmd命令
        //Runtime.getRuntime().exec("notepad");
        //shutdown能够执行关机命令，但要跟加参数
        //-s默认1mine后关机   -s-t+数字（秒）指定关机时间    -a取消关机   -r关机并重启
        Runtime.getRuntime().exec("shutdown -a");
        System.out.println("取消关机成功");

    }
}
