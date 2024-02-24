package a01staticDemo1;

public class demo1TEXT {
    public static void main(String[] args) {
        /*编写一个工具类
        1.提供工具类方法printArr，用于返回数组类容：如[23,14,15,16]
        2.提供工具方法getAverage用于返回平均值
         */
        int[] arr={10,20,24,45,43};
        double[] arr2={10.4,12.5,31.7};
        ArryUtil.printArr(arr);
        ArryUtil.getAverage(arr2);
        System.out.println(ArryUtil.printArr(arr));
        System.out.println(ArryUtil.getAverage(arr2));
    }
}
