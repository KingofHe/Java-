package a1exerciseDemo1;

public class manner extends Employee{
    private double bonus;

    public manner() {

    }

    public manner(String id, String name, int income, double bonus) {
        super(id, name, income);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("经理在管理其他员工");
    }
}
