public class Accout {
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;
    private int balance;
    public void setBalance(int balance) {
        if (balance > MAX_BALANCE || balance < MIN_BALANCE) {
        } else {
            this.balance = balance;
        }
    }
    public int getBalance() {
        return balance;
    }
}
