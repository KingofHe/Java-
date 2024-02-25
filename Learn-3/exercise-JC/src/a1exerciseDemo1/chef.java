package a1exerciseDemo1;

public class chef extends Employee{
    public chef() {
    }

    public chef(String id, String name, int income) {
        super(id, name, income);
    }

    public void work(){
        System.out.println("厨师在做饭");
    }
}
