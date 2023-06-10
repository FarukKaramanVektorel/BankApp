public class BankAccount {
    private String accountNumber; // Hesap numarasını temsil eder. (Represents the account number.)
    private double balance; // Hesap bakiyesini temsil eder. (Represents the account balance.)
    private String[] transactionHistory; // Hesap hareketlerinin geçmişini tutar. (Stores the transaction history.)
    private int transactionCount; // Hesap hareketlerinin sayısını tutar. (Stores the count of transactions.)

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new String[100]; // Maksimum 100 işlem kaydedilebilir. (Maximum of 100 transactions can be recorded.)
        this.transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String[] getTransactionHistory() {
        return transactionHistory;
    }

    public void deposit(double amount) {
        balance += amount;
        String transaction = "Deposit: " + amount;
        transactionHistory[transactionCount] = transaction;
        transactionCount++;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            String transaction = "Withdrawal: " + amount;
            transactionHistory[transactionCount] = transaction;
            transactionCount++;
        } else {
            System.out.println("Insufficient balance!"); // Yetersiz bakiye durumunda ekrana bir hata mesajı yazdırır. (Prints an error message to the console in case of insufficient balance.)
        }
    }
}
