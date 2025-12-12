package services;

public class OnSitePaymentProcessor {

    public boolean payAtLocation(double amount) {
        System.out.println("💵 On-site payment received. Amount: " + amount);
        return true;
    }
}
