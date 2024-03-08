package 删除文件;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        File file = new File("create.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("文件创建成功");
            } else System.out.println("已经存在");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(file.delete()){
            System.out.println("成功删除文件");
        }else{
            System.out.println("删除文件失败");
        }
    }
}
