//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class ClassMain {
    public static void main(String[] args) {
        //泛型基本知识：泛型是在jdk5之后出现的，是为了统一集合中元素的数据类型
        //因为是在jdk5后才出现，所以泛型的基本原理是：
        //集合中的泛型只是在编译的过程中判断写入的数据是否满足要求，在集合的内部底层，仍然是将引用数据类型
        //强转为object类型，在外部获取时又将其转换为泛型类型
        //泛型类、泛型方法、都可以自己书写，格式就是在类或者方法后面加<E>方法是加在修饰符后面的
        //E就是一个符号表示传入的确定的数据类型，可以用任何字母代替

        //试用我自己写的集合
        MyArrayList<String> arr=new MyArrayList<>();
        arr.add("hzxshidashabi");
        arr.add("dashazi");
        arr.get(1);
        arr.get(0);
        arr.toString();
        System.out.println(arr.get(1)+'\t'+arr.get(0)+'\t'+arr.toString());
        System.out.println(arr);
    }
}