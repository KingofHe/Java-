package a1exerciseDemo01;

public class Testmain {
    public static void main(String[] args) {
        Person p=new Person("老王",38);
        Dog d=new Dog(2,"黑");
        p.keepPet1(d,"狗粮");
        Cat c=new Cat(1,"白");
        p.keepPet2(c,"猫粮");
        Animal a=new Dog(1,"花");
        p.keeppet(a,"饲料");


    }
}
