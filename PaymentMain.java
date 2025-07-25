package odenishSistemiApp;

import java.util.Locale;
import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("   ---    Ödəniş Sistemi    ---");
        System.out.println();
        System.out.println("--- Hissə A: Metodun Yüklənməsi (Method Overloading) Yoxlaması ---");

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(150.75);
        paymentProcessor.processPayment(200.0, 5.0);

        System.out.println();
        System.out.println("--- Hissə B: Metodun Ləğvi (Method Overriding) Yoxlaması ---");

        PaymentMethod card = new CardPayment();
        PaymentMethod cash = new CashPayment();
        PaymentMethod online = new OnlinePayment();
        PaymentMethod paymentMethod = new PaymentMethod();

        card.displayStatus();
        cash.displayStatus();
        online.displayStatus();
        paymentMethod.displayStatus();

        System.out.println();
        System.out.println("--- İnteraktiv Ödəniş Prosesi ---");

        double amount = -1;
        while (amount <= 0) {
            System.out.print("Zəhmət olmasa ödəniş məbləğini daxil edin (müsbət ədəd): ");
            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount < 0) {
                    System.out.println("Məbləğ müsbət olmalıdır. Yenidən cəhd edin.");
                } else if (amount == 0) {
                    System.out.println("Məbləğ 0-a bərabər olmamalıdır. Yenidən cəhd edin.");
                }
            } else {
                System.out.println("Yanlış giriş! Zəhmət olmasa ədəd şəklində məbləğ daxil edin.");
                scanner.next();
            }
        }

        System.out.println("Odenis metodunu secin: ");
        System.out.println("1 - Kart");
        System.out.println("2 - Nağd");
        System.out.println("3 - Onlayn");
        System.out.print("Seçiminizi daxil edin: ");

        int choice = scanner.nextInt();

        PaymentMethod p = null;

        switch (choice){
            case 1:
                p = new CardPayment();
                break;

            case 2:
                p = new CashPayment();
                break;

            case 3:
                p = new OnlinePayment();
                break;

            default:
                System.out.println("Yanlis secim etdiniz");
        }

        System.out.println("\n Ödəniş prosesi başlayır...");
        p.displayStatus();
        System.out.println(amount + " AZN ümumi ödəniş əməliyyatı icra edildi.");

    }
}
