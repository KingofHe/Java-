import java.util.HashMap;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        HashMap<Integer,Account> map=new HashMap<>();
        Account[] arr=new Account[4];
        creatHashinfor(map,arr);              //初始化account数据并设置键对值
        makeTransaction(map);            //调用交易方法---通过取款实现
    }
    public static void makeTransaction(HashMap<Integer,Account> map){
        System.out.println("请输入账户账号");
        Scanner sc=new Scanner(System.in);
        int accountid=sc.nextInt();
        boolean re=map.containsKey(accountid);
        if(re==true){
            Account desaccount=map.get(accountid);
            System.out.println("请输取款金额");
            double money=sc.nextDouble();
            desaccount.withdrawal(money);
        }else{
            try {
                throw new InvalidAccountException("账户非法");
            } catch (InvalidAccountException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void creatHashinfor(HashMap<Integer,Account> map,Account[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Account();
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j].setAccountnum(j+1);
        }
        arr[0].setBalance(3079.28);
        arr[1].setBalance(4033.28);
        arr[2].setBalance(7094.16);
        arr[3].setBalance(4060.11);
        for(Account account:arr){
            map.put(account.getAccountnum(),account);
        }
    }
}
