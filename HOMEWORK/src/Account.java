public class Account {
    private int accountnum;
    private double balance;

    public void withdrawal(double num){
        if(num>balance){
            try {
                throw new InsufficientBalanceException("账户余额不足");
            } catch (InsufficientBalanceException e) {
                throw new RuntimeException(e);
            }
        }else{
            balance-=num;
            System.out.println("交易成功");
        }
    }
    public void deposit(double num){
        balance+=num;
    }

    public Account(int accountnum, double balance) {
        this.accountnum = accountnum;
        this.balance = balance;
    }

    public Account() {
    }

    public int getAccountnum() {
        return accountnum;
    }

    public void setAccountnum(int accountnum) {
        this.accountnum = accountnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
