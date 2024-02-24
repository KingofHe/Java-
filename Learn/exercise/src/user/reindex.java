package user;

import java.util.ArrayList;
import java.util.Scanner;

public class reindex {
    public static void main(String[] args) {
        ArrayList<useri> list=new ArrayList<>();
        useri u1=new useri("zhangsan","123456","12");
        useri u2=new useri("lisi","13579","15");
        useri u3=new useri("wangwu","246810","1204");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查询的学生id");
        String id=sc.next();
        int index=selectreindex(list,id);
        if(index==-1)
            System.out.println("集合中不存在该id信息");
        else
            System.out.println("该id在集合中存储的索引为:"+index);
    }
    public static int selectreindex(ArrayList<useri> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())==true)
                return i;
        }
        return -1;
    }
}
