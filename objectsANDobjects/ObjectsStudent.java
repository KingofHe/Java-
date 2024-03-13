package objectsANDobjects;

import java.util.Objects;

public class ObjectsStudent {
    private String name;
    private int age;

    public ObjectsStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ObjectsStudent() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectsStudent that = (ObjectsStudent) o;
        return age == that.age && Objects.equals(name, that.name);
    }



}
