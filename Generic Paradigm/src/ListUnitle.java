import java.util.ArrayList;

public class ListUnitle {
    private ListUnitle(){

    }
    public static<E> void addAll(ArrayList<E> list,E...e){
        //E...e表示数量不定的添加，即外部传任意个数的参熟都行
        for (E element : e) {
            list.add(element);
        }
    }
}
