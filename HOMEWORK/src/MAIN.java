import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class MAIN {
    public static int MAX=100;
    public static void main(String[] args) {
        //先从input文件中读取学生信息并计算平均成绩
        //再将平均成绩与姓名的信息存入output文件中
        File file=new File("input.txt");
        File file2=new File("output.txt");
        BufferedReader reader=null;
        String[] arr=new String[MAX];
        int index=0;
        try{
            reader=new BufferedReader(new FileReader(file));
            String line;
            while((line=reader.readLine())!=null){
                arr[index]=line;
                index++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        Student[] sarr=new Student[MAX];
        for (int k = 0; k <= index; k++) {
            sarr[k]=new Student();
        }
        for (int t = 0; t < index; t++) {
            String[] str=arr[t].split(" ");
            sarr[t].setName(str[0]);
            sarr[t].setCore1(Double.parseDouble(str[1]));
            sarr[t].setCore2(Double.parseDouble(str[2]));
            sarr[t].setCore3(Double.parseDouble(str[3]));
            sarr[t].setAverage((sarr[t].getCore1()+sarr[t].getCore2()+sarr[t].getCore3())/3);
        }
        //下面实现文件的写入
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(file2))){
            int num=0;
            while(num<index){
                String formatedAverage=String.format("%.2f",sarr[num].getAverage());
                writer.write(sarr[num].getName());
                writer.write(formatedAverage);
                num++;
            }
            writer.flush();
            System.out.println("学生信息写入文件成功");
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
