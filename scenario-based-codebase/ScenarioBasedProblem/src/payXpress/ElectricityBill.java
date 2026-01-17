package payXpress;

public class ElectricityBill extends Bill implements IPayable {

    public ElectricityBill(double amount, String dueDate)
    {
        super("Electricity", amount, dueDate);
    }

    public void pay()
    {
        if(!getPaymentStatus())
        {
            markAsPaid();
            System.out.println("Electricity bill paid successfully.");
        }
    }

    @Override
    public void sendReminder()
    {
        System.out.println("Reminder: Please pay your Electricity Bill before " + dueDate);
    }
}
