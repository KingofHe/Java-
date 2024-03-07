import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        System.out.println("Please input a sentence");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String reault=getchange(str);
        int count=getaeiou(str);
        System.out.println(reault);
        System.out.println(count);

    }
    public static int getaeiou(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case 'a'->count++;
                case 'e'->count++;
                case 'i'->count++;
                case 'o'->count++;
                case 'u'->count++;
                case 'A'->count++;
                case 'E'->count++;
                case 'I'->count++;
                case 'O'->count++;
                case 'U'->count++;
                default -> {
                    break;
                }
            }
        }
        return count;
    }
    public static String getchange(String str){                                    //ab cd ef
        char[] arr=str.toCharArray();
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            boolean re=check(arr[i]);
            if(re==false){
                reverse(arr,index,i-1);
                index=i+1;
                if(index>arr.length-1)
                    break;
            }
        }
        Capital(arr);
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    public static boolean check(char c){
        if (c >= 'A' && c <= 'Z') {
            return true;
        }if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }
    public static char[] Capital(char[] arr){
        arr[0]=Character.toUpperCase(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if(check(arr[i])==false){
                if(i==arr.length-1)
                    break;
                else{
                   arr[i+1]=Character.toUpperCase(arr[i+1]);
                }
            }
        }
        return arr;
    }
    public static char[] reverse(char[] arr,int index,int end){
        while(true){
            char temp;
            temp=arr[index];
            arr[index]=arr[end];
            arr[end]=temp;
            index++;
            end--;
            if(index>=end)
                break;
        }
        return arr;
    }
}