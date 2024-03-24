//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Integer {
    public static void main(String[] args) {
        //静态方法创建integer对象
        java.lang.Integer a=java.lang.Integer.valueOf(1234);
        java.lang.Integer b=java.lang.Integer.valueOf("123");
        java.lang.Integer c=java.lang.Integer.valueOf("123",4);
        System.out.println(a+" "+b+" "+c);
        //以上方法是jdk5以前的，了解就行
        //需要注意的是：调用这个方法创建对象时，底层是已经创建了一个数组的数组中存了范围在-128~127的数，如果valueof的数据在这个范围内
        //就不会创建新的对象，而实利用底层中已经创建好的直接使用
        java.lang.Integer i1= java.lang.Integer.valueOf(127);
        java.lang.Integer i2= java.lang.Integer.valueOf(127);
        System.out.println(i1==i2);
        java.lang.Integer i3= java.lang.Integer.valueOf(128);
        java.lang.Integer i4= java.lang.Integer.valueOf(128);
        System.out.println(i3==i4);



        //在JDK5以后，内部设置了自动装箱与自动拆箱，即直接可以赋值
        java.lang.Integer c1=10;
        //integer中的方法
        //public static String toBinaryString(int 1);将数据转换为2进制字符串数据
        //类似的还有可以转换为8进制、16进制的数据
        //public static int parseInt(String s)       将字符串类型数据转换为整型
        int c2= java.lang.Integer.parseInt("145");
        System.out.println(c2+1);
        //在包装类中除了Character其他都有parseXxx的方法，都是能够将字符串类型数据转换为包装类所对应基本数据类型的数据
        //例如：
        Boolean c3=Boolean.parseBoolean("false");
        System.out.println(c3);
    }
}