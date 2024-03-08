package 创建文件;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class 创建 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        File f=new File(s);
        try{
            if(f.createNewFile()){
                System.out.println("Create successfully");
            }else{
                System.out.println("File already exist");
            }
        }catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
