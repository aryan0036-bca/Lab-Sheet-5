class BankAccount {
    private String accountNumber, accountHolder;
    private double balance;
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String n) { accountNumber = n; }
    public String getAccountHolder() { return accountHolder; }
    public void setAccountHolder(String h) { accountHolder = h; }
    public double getBalance() { return balance; }
    public void setBalance(double b) {
        if (b >= 0) balance = b;
        else System.out.println("Invalid opening balance.");
    }
    public void deposit(double amount) {
        if (amount > 0) { balance += amount; System.out.println("Deposited: Rs. " + amount); }
        else System.out.println("Invalid deposit amount.");
    }
    public void withdraw(double amount) {
        if (amount <= 0) System.out.println("Invalid withdrawal amount.");
        else if (amount > balance) System.out.println("Insufficient balance.");
        else { balance -= amount; System.out.println("Withdrawn: Rs. " + amount); }
    }
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.setAccountNumber("123456789"); a.setAccountHolder("Riya"); a.setBalance(5000);
        a.deposit(1500); a.withdraw(2000);
        System.out.println("Account: " + a.getAccountNumber());
        System.out.println("Holder: " + a.getAccountHolder());
        System.out.println("Balance: Rs. " + a.getBalance());
        a.deposit(-100); a.withdraw(10000);
    }
}
