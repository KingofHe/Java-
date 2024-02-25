package a3exerciseDemo03;

public class studentsys {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        String name="张三";
        t.setName(name);
        String id="1204";
        t.setId(id);
        Student s=new Student();
        s.setName("王五");
        s.setId("333");
        Adiminer a=new Adiminer();
        a.setName("李四");
        a.setId("444");
        register(t);
        register(a);
        register(s);
    }
    public static void register(Person p){
        p.show();
    }
}
