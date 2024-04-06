package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.function.Consumer;

public class choice {
    public static void main(String[] args) {
        //统计投票数
        //先用arraylist集合储存每个人的投票，然后用hashmap计算每个选项的投票总数，利用的是覆盖的原理，
        //每投一次票就将value值加一，如果出现hashmap中未包含的选项就在hashmap中添加该选项
        ArrayList<Character> list=new ArrayList<>();
        char[] arr={'A','B','C','D'};
        Random r=new Random();
        for (int i=0;i<80;i++){
            int index=r.nextInt(3);
            list.add(arr[index]);
        }
        HashMap<Character,Integer> map=new HashMap<>();
        list.forEach(new Consumer<Character>() {
            @Override
            public void accept(Character character) {
                if(map.containsKey(character)){
                    int count=map.get(character);
                    count++;
                    map.put(character,count);
                }else{
                    map.put(character,1);
                }
            }
        });
        System.out.println(map);

    }
}
