package odenishSistemiApp;

public class PaymentProcessor {

    public void processPayment(double mebleg){
        System.out.println("Satış #1: " + mebleg + " AZN ümumi ödəniş emal edildi.");
    }


    public void processPayment(double mebleg, double faiz){
        double totalAmount = mebleg + ( mebleg * faiz / 100);
        System.out.println("Satış #2: " + mebleg + " AZN ödəniş (" + faiz + " % əlavə ilə) yekun " + totalAmount + " AZN olaraq ödəniş edildi.");
    }

}
