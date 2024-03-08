package 读取文件;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class useBufferedReader {
    public static void main(String[] args) {
        File file=new File("create.txt");
        try{
            if(file.createNewFile()){
                System.out.println("成功创建文件");
            }else{
                System.out.println("文件已经存在");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
//        BufferedReader reader=null;
//        try {
//            reader = new BufferedReader(new FileReader(file));
//            String line;
//            while ((line=reader.readLine())!=null)
//                System.out.println(line);
//        }catch(IOException e){
//            e.printStackTrace();
//        }
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
