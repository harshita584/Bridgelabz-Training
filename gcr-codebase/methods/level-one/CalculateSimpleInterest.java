import java.util.Scanner;
class CalculateSimpleInterest{
 //Method for calculating simple interest
 public static void calculateSimpleInterest(double principal,double rate,double time){
        double interest= (principal*rate*time)/100;
        System.out.println("The Simple interest is "+interest+" for Principal "+principal+" ,Rate of Interest "+rate+" and Time "+time);
         
}
  
   public static void main(String []args){
       Scanner scanner=new Scanner(System.in);

       //Taking Principal,Rate of interest and time in months from the user for calculating simple interest 
       System.out.println("Enter the Principal amount");
       double principal=scanner.nextInt(); 
       System.out.println("Enter the Rate of interest");
       double rate=scanner.nextInt();
       System.out.println("Enter Time in Years ");
       double time=scanner.nextInt();
       
      //  calling the method for calculating simple interest
      CalculateSimpleInterest.calculateSimpleInterest(principal,rate,time);
       scanner.close();
       
     }
}