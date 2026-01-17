package payXpress;

public class PayXpressApp {

    public static void main(String[] args) {

        IPayable bill1 = new ElectricityBill(1200, "15-Jan-2026");
        IPayable bill2 = new WaterBill(500, "18-Jan-2026");
        IPayable bill3 = new InternetBill(999, "10-Jan-2026");

        bill1.sendReminder();
        bill1.pay();

        bill2.sendReminder();
        bill2.pay();

        bill3.sendReminder();
        bill3.pay();
    }
}
