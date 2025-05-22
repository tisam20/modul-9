class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran dengan " + amount + " dalam mata uang.");
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran dengan " + amount + " " + currency + " dalam mata uang.");
    }
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran dengan Kartu Kredit sebesar " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran dengan Kartu Kredit sebesar " + amount + " " + currency);
    }
}

class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran dengan E-Wallet sebesar " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran dengan E-Wallet sebesar " + amount + " " + currency);
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran dengan Transfer Bank sebesar " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran dengan Transfer Bank sebesar " + amount + " " + currency);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
            new CreditCard(),
            new EWallet(),
            new BankTransfer()
        };

        System.out.println(" Test tanpa mata uang (Overriding) ");
        for (PaymentMethod pm : payments) {
            pm.processPayment(100000); 
        }

        System.out.println("\n Test dengan mata uang (Overloading) ");
        for (PaymentMethod pm : payments) {
            pm.processPayment(150000, "USD"); 
        }
    }
}