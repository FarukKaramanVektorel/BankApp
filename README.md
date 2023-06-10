# Bank Application

Bank Application is a simple bank account simulation written in Java. This application allows users to manage their account balances, make deposits and withdrawals, and track transaction history.

## Features

- Create a bank account with an account number.
- Check the current balance of the account.
- Deposit money into the account.
- Withdraw money from the account.
- View the transaction history.

## How to Use

1. Clone the repository or download the source code files.
2. Open the project in your preferred Java development environment.
3. Run the `Main` class to start the application.
4. Follow the instructions in the console to interact with the bank account.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890");
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Current Balance: " + account.getBalance());
        String[] transactions = account.getTransactionHistory();
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
In this example, we create a BankAccount object with the account number "1234567890". We then deposit 1000 units of currency into the account and withdraw 500 units. The current balance is displayed using the getBalance() method, and the transaction history is retrieved and printed to the console.

## Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License
This project is licensed under the MIT License. See the LICENSE file for details.


# Banka Uygulaması

Banka Uygulaması, Java dilinde yazılmış basit bir banka hesabı simülasyonudur. Bu uygulama, kullanıcıların hesap bakiyelerini yönetmelerini, para yatırma ve çekme işlemleri yapmalarını ve işlem geçmişini takip etmelerini sağlar.

## Özellikler

- Hesap numarasıyla banka hesabı oluşturma.
- Hesabın mevcut bakiyesini kontrol etme.
- Hesaba para yatırma.
- Hesaptan para çekme.
- İşlem geçmişini görüntüleme.

## Nasıl Kullanılır

1. Bu projeyi klonlayın veya kaynak kod dosyalarını indirin.
2. Tercih ettiğiniz Java geliştirme ortamında projeyi açın.
3. `Main` sınıfını çalıştırarak uygulamayı başlatın.
4. Konsol ekranındaki talimatları izleyerek banka hesabıyla etkileşimde bulunun.

## Örnek Kullanım

```java
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890");
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Mevcut Bakiye: " + account.getBalance());
        String[] transactions = account.getTransactionHistory();
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
Bu örnekte, "1234567890" hesap numarasıyla bir BankAccount nesnesi oluşturulur. Ardından, hesaba 1000 birim para yatırılır ve 500 birim çekilir.
getBalance() metoduyla mevcut bakiye ekrana yazdırılır ve işlem geçmişi alınarak konsola yazdırılır.

## Katkıda Bulunma
Katkılarınızı bekliyoruz! Eğer herhangi bir sorun bulursanız veya iyileştirme önerileriniz varsa, lütfen bir sorun açın veya bir "pull request" gönderin.

## Lisans
Bu proje MIT Lisansı ile lisanslanmıştır. Detaylar için LICENSE dosyasına bakın.
