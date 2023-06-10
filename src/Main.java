public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("1234567890");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(1000);
        System.out.println("New Balance after Deposit: " + account.getBalance());

        account.withdraw(500);
        System.out.println("New Balance after Withdrawal: " + account.getBalance());

        account.withdraw(800);
        System.out.println("New Balance after Withdrawal: " + account.getBalance());

        System.out.println("Transaction History:");
        String[] transactions = account.getTransactionHistory();
        for (int i = 0; i < account.getTransactionCount(); i++) {
            System.out.println(transactions[i]);
        }

    }
}