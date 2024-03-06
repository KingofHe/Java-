package exercise1;

public abstract class coach extends person{
    public abstract void teach();

    public coach(String name, int age) {
        super(name, age);
    }

    public coach() {
    }
}
