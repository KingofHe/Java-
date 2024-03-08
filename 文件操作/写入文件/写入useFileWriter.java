package 写入文件;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class 写入useFileWriter {
    public static void main(String[] args) {
        String s="create.txt";
        String s1="Hello World";
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
        try(FileWriter writer=new FileWriter(f,true)){
            writer.write(s1);
            writer.flush();
            System.out.println("Content written to file successfully.");
        }catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
