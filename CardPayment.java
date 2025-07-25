package odenishSistemiApp;

public class CardPayment extends PaymentMethod{

    @Override
    public void displayStatus() {
        System.out.println("Kart ödənişi vəziyyəti: Kart oxuyucu aktivdir, PIN kodu gözlənilir.");
    }
}
