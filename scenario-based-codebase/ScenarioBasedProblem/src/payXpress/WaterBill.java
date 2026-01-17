package payXpress;

public class WaterBill extends Bill implements IPayable {

    public WaterBill(double amount, String dueDate)
    {
        super("Water", amount, dueDate);
    }

    public void pay()
    {
        if(!getPaymentStatus())
        {
            markAsPaid();
            System.out.println("Water bill paid successfully.");
        }
    }

    @Override
    public void sendReminder()
    {
        System.out.println("Reminder: Water bill due on " + dueDate);
    }
}
