package services;

public interface PaymentProcessor {
    boolean pay(double amount);
}
public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public boolean pay(double amount) {
        System.out.println("💳 Card payment: " + amount);
        return true;
    }
}
public class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public boolean pay(double amount) {
        System.out.println("💲 PayPal payment: " + amount);
        return true;
    }
}
public class CashPaymentProcessor implements PaymentProcessor {
    @Override
    public boolean pay(double amount) {
        System.out.println("💵 Cash payment: " + amount);
        return true;
    }
}
public class OnSitePaymentProcessor implements PaymentProcessor {
    @Override
    public boolean pay(double amount) {
        System.out.println("🏨 On-site payment: " + amount);
        return true;
    }
}
