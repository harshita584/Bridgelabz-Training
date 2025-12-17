// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 

public class ProfitLoss
{
    // Main method: program execution starts here
    public static void main(String args[])
    {
       double sellingPrice = 191;
       double costPrice = 129;
      
       //calculating the profit using Profit = selling price - cost price
       double profit = sellingPrice - costPrice;
        
       //calculating the profit percentage using Profit Percentage = profit / cost price * 100
       double profitPercentage = (profit / costPrice) * 100;
 
       //Display the output
       System.out.println(
                "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                "The Profit is INR " + profit + "\n" +
                "The Profit Percentage is " + profitPercentage + "%");

        
    }
}
