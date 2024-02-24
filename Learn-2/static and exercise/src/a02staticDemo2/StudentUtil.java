package a02staticDemo2;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}
    public static int getBage(ArrayList<Student> list){
        int bage=list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge()>bage)
                bage=list.get(i).getAge();
        }
        return bage;
    }
}
