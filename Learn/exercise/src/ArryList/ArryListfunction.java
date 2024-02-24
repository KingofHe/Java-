package ArryList;

import java.util.ArrayList;

public class ArryListfunction {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        list.add("aaa");
        list.add("bbb");
        System.out.println(list);
        list.remove("aaa");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add("aaa");
        list.add("bbb");
        list.set(0,"ccc");
        System.out.println(list);
        System.out.println(list.size());
    }
}
