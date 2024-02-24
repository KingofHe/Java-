package ArryList;

public class student {
    //私有化成员变量
    //每个成员变量对应的set/get方法
    //空参构造
    //带参构造
    private String name;
    private int age;


    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
}