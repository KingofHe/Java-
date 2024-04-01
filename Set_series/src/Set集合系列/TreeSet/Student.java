package Set集合系列.TreeSet;

public class Student implements Comparable<Student>{
    private String name;
    private  int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
        /*
        this表示要添加的元素，o表示红黑树中已经存在的元素
        返回值：整形
        1.负数：则认为要添加的元素是小的，就放在左边
        2.整数：则认为要添加的元素是大数，就存在右边
        3.0：则认为元素已经存在了，就舍弃
         */
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
