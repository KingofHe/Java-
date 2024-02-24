package ArryList;

import java.util.ArrayList;

public class studentarrylist {
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        student s1=new student("zhangsan",23);
        student s2=new student("wangwu",24);
        student s3=new student("lisi",25);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            student stu=list.get(i);
            System.out.println(stu.getName()+","+stu.getAge()+"岁");
        }
    }
}
