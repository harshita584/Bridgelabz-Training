import java.util.Scanner;

public class NumberCheck {
    // method for finding the number is positive negative or zero
    public static int numberCheck(int number){
         if(number<0) return-1;
         else if(number == 0) return 0;
         else return 1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;

        //taking input from the user
        System.out.println("Enter a Number :");
        number=scanner.nextInt();

        //calling the method and printing the answer
        switch (NumberCheck.numberCheck(number)) {
            case -1:
                System.out.println("Negative");
                break;
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Positive");
                break;
            default:
                System.out.println("Please Enter a Integer only ");
                break;
        }
        scanner.close();
    }
}
