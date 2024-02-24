package user;

import java.util.ArrayList;
import java.util.Scanner;

public class usermain {
    public static void main(String[] args) {
        ArrayList<useri> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        useri u1=new useri("zahngsan","12345678","12");
        useri u2=new useri("lisi","13579","15");
        useri u3=new useri("wangwu","246810","1204");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        System.out.println("请输入要查询学生的ID");
        String ID=sc.next();
        System.out.println(contain(list,ID));
    }
    public static boolean contain(ArrayList<useri> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())==true)
                return true;
        }
        return false;
    }
}
