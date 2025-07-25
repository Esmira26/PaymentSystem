package odenishSistemiApp;

public class CashPayment extends PaymentMethod{

    @Override
    public void displayStatus(){
        System.out.println("Nağd ödəniş vəziyyəti: Nəğd pul qəbul edildi, geri pul verilməlidir.");
    }
}
