package 综合练习题;

import java.util.ArrayList;

public class mian {
    public static void main(String[] args) {
        ArrayList<cat1> list1=new ArrayList<>();
        list1.add(new cat1("xiaohua",1));
        list1.add(new cat1("huahua",2));
        keep1(list1);


    }
    public static void keep1(ArrayList<? extends cat> list){
        for (cat cat : list) {
            cat.eat();
        }
    }
    public static void keep2(ArrayList<? extends dog> list){
        for (dog dog : list) {
            dog.eat();
        }
    }
    public static void keep(ArrayList<? extends animals> list){
        for (animals animal : list) {
            animal.eat();
        }
    }

}
