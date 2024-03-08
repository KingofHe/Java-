package 写入文件;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class 写入useBufferedWriter {
    public static void main(String[] args) {
        File file=new File("create.io");
        try{
            if(file.createNewFile()){
                System.out.println("successfully");
            }else{
                System.out.println("exists");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        String sentence="Hello He";
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(file,true))){
            writer.write(sentence);
            writer.flush();
            System.out.println("写入成功");
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
