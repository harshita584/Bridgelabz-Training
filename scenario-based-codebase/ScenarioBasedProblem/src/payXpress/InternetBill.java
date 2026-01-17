package payXpress;

public class InternetBill extends Bill implements IPayable {

    public InternetBill(double amount, String dueDate)
    {
        super("Internet", amount, dueDate);
    }

    public void pay()
    {
        if(!getPaymentStatus())
        {
            markAsPaid();
            System.out.println("Internet bill paid successfully.");
        }
    }

    @Override
    public void sendReminder()
    {
        System.out.println("Alert: Internet service will stop if bill is unpaid after " + dueDate);
    }
}
