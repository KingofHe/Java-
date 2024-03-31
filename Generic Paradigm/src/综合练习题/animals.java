package 综合练习题;

public abstract class animals {
    private String name;
    private int age;

    public abstract void eat();
    public animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public animals() {
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
