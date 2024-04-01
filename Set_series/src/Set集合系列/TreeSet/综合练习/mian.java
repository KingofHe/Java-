package Set集合系列.TreeSet.综合练习;

import Set集合系列.HashSet.student;

import java.util.Comparator;
import java.util.TreeSet;

public class mian {
    public static void main(String[] args) {
        /*
        题目要求：创建五个学生对象
        属性：姓名，年龄，总分成绩，语文成绩，数学成绩，英语成绩
        1.按照总分排序，由高到低   2.总分一样就按语文成绩排序，其次按照数学和英语成绩排序
        3.如果成绩都一样那么按照年龄排序    4.年龄一样就按照姓名字母排序    如果姓名都一样就认为是同一个人，不存
         */

        Student s1=new Student("zhangsan",17,400,120,145,135);
        Student s2=new Student("lisi",18,390,120,140,130);
        Student s3=new Student("wangwu",18,400,120,140,140);
        Student s4=new Student("zhouliu",18,400,125,140,135);
        Student s5=new Student("zhangsan",17,400,120,145,135);

        //方式1，利用student类中comparable的重写
        TreeSet<Student> ts1=new TreeSet<>();
        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        ts1.add(s4);
        ts1.add(s5);
        for (Student student : ts1) {
            System.out.println(student);
        }
        System.out.println("--------------------------------------------------------------------");

        //方式2，利用comparetor比较器
        TreeSet<Student> ts2=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {   //o1表示要添加的元素
                double i=o2.getTalgrate()-o1.getTalgrate();
                if(i!=0)
                    return (int)i;
                else{
                    i=o2.getChinese()-o1.getChinese();
                    if (i!=0)
                        return (int)i;
                    else{
                        i=o2.getMath()-o1.getMath();
                        if(i!=0)
                            return (int)i;
                        else{
                            i=o2.getEnglish()-o1.getEnglish();
                            if(i!=0)
                                return (int)i;
                            else{
                                i=o2.getAge()-o1.getAge();
                                i=i==0?i:o2.getName().compareTo(o1.getName());
                                return (int)i;
                            }
                        }
                    }
                }
            }
        }); //循环嵌套太多，多次使用三目表达式简化式子
        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        ts2.add(s4);
        ts2.add(s5);
        for (Student student : ts2) {
            System.out.println(student);
        }
        System.out.println("--------------------------------------------------------------------");




        TreeSet<Student> ts3=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                double i=o2.getTalgrate()-o1.getTalgrate();
                i=i==0?o2.getChinese()-o1.getChinese():i;
                i=i==0?o2.getMath()-o1.getMath():i;
                i=i==0?o2.getEnglish()-o1.getEnglish():i;
                i=i==0?o2.getAge()-o1.getAge():i;
                i=i==0?o2.getName().compareTo(o1.getName()):i;
                return (int)i;
            }
        });
        ts3.add(s1);
        ts3.add(s2);
        ts3.add(s3);
        ts3.add(s4);
        ts3.add(s5);
        for (Student student : ts3) {
            System.out.println(student);
        }

    }
}
