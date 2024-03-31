import java.util.Arrays;

public class MyArrayList <E>{
    Object[] obj=new Object[10];
    int size=0;
    public void add(E e){
        obj[size]=e;
        size++;
    }
    public E get(int index){
        return (E)obj[index];
    }
    public String toString(){
        return Arrays.toString(obj);
    }
}
