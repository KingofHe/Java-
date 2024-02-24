import java.util.ArrayList;
import java.util.Scanner;

public class mainmoudle {
    public static void main(String[] args) {
        ArrayList<studentinfo> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("--------------欢迎进入学生管理系统-----------------");
        int opt=1;
        while(opt!=5){
            System.out.println("1.添加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.查询学生信息");
            System.out.println("5.退出管理系统");
            System.out.println("====================================================");
            System.out.println("请输入您的选择"+'\n');
            opt=sc.nextInt();
            switch(opt){
                case 1:
                    Add(list);
                    break;
                case 2:
                    System.out.println("请输入需要删除的学生的id");
                    String tID=sc.next();
                    Delt(list,tID);
                    break;
                case 3:
                    System.out.println("请输入需要更改信息的学生的id");
                    String id=sc.next();
                    Exchange(list,id);
                    break;
                case 4:
                    Elect(list);
                    break;
                case 5:
                    System.out.println("成功退出管理系统");
                    break ;
                default:
                    System.out.println("选择错误，请重新选择");
                    break;
            }
        }
    }

    public static void Add(ArrayList<studentinfo> list){
        Scanner sc=new Scanner(System.in);
        String id;
        boolean result;
        do {
            System.out.println("请输入学生id");
            id = sc.next();
            result = Checkonly(list, id);
            if(result==false){
                System.out.println("id信息重复请重新输入");
            }
        }while(result==false);
        System.out.println("请输入学生姓名");
        String name=sc.next();
        System.out.println("请输入学生年龄");
        int age=sc.nextInt();
        System.out.println("请输入学生家庭住址");
        String address=sc.next();
        studentinfo s=new studentinfo(id,name,age,address);
        list.add(s);
        System.out.println("添加学生信息成功\n");

        /*Scanner sc=new Scanner(System.in);
        studentinfo s=new studentinfo();
        System.out.println("请输入学生id");
        String id=sc.next();
        s.setId(id);
        System.out.println("请输入学生姓名");
        String name=sc.next();
        s.setName(name);
        System.out.println("请输入学生年龄");
        int age=sc.nextInt();
        s.setAge(age);
        System.out.println("请输入学生家庭住址");
        String address=sc.next();
        s.setAddress(address);
        list.add(s);*/
    }

    public static void Delt(ArrayList<studentinfo> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())==true){
                list.remove(i);
                System.out.println("学生信息删除完成\n");
                return;
            }
        }
        System.out.println("未查询到该学生\n");
    }

    public static void Elect(ArrayList<studentinfo> list){
        if(list.size()==0){
            System.out.println("还未存储学生信息，请添加后再查询\n");
            return;
        }
        System.out.println("id\t\t姓名\t\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i).getId()+list.get(i).getName()+list.get(i).getAge()+list.get(i).getAddress());
            studentinfo stu=list.get(i);
            System.out.println(stu.getId()+"\t"+"\t"+stu.getName()+"\t\t"+stu.getAge()+"\t\t"+stu.getAddress());
        }


    }

    public static void Exchange(ArrayList<studentinfo> list,String id){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)==true){
                studentinfo stu=list.get(i);
                System.out.println("请输入修正姓名");
                String newName=sc.next();
                stu.setName(newName);
                System.out.println("请输入修正年龄");
                int newAge=sc.nextInt();
                stu.setAge(newAge);
                System.out.println("请输入修正家庭住址");
                String newAddress=sc.next();
                stu.setAddress(newAddress);
                System.out.println("学生信息修改成\n");

            }
        }
        System.out.println("未查询到该生信息\n");
    }

    public static boolean Checkonly(ArrayList<studentinfo> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)==true)
                return false;
        }
        return true;
    }
}
