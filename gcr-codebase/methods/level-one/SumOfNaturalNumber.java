import java.util.Scanner;

public class SumOfNaturalNumber {
    
    //method for calculating the sum of all natural number until that inputed number 
    public static void sumOfNaturalNumbers(int number){
        int sum=0;
        if (number<=0) {
            System.out.println("Please enter a natural number");
        }else{
            for (int i = 1; i <= number; i++) {
                sum+=i;
            }
            System.out.println("Sum is : "+sum);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;

        // taking input from the user
        System.out.println("Enter a number :");
        number=scanner.nextInt();
        
        // calling the method
        SumOfNaturalNumber.sumOfNaturalNumbers(number);

        scanner.close();

    }
}
