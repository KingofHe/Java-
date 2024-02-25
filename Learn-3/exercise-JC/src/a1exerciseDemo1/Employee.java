package a1exerciseDemo1;

public class Employee {
    //所有的成员变量，私有化
    //对应的set/get方法
    //空参构造，带全部参数的构造
    private String id;
    private String name;
    private int income;

    public Employee() {
    }

    public Employee(String id, String name, int income) {
        this.id = id;
        this.name = name;
        this.income = income;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", income = " + income + "}";
    }

    public void work(){
        System.out.println("员工在工作");
    }
    public void eat(){
        System.out.println("员工在吃饭");
    }
}
