import java.util.Scanner;

public class FindRemainderAndQuotient {
    // method for finding the remainder and Quotient  at first index we stored Quotient and at the second index we Stored remainder 
    public static int[] findRemainderAndQuotient(int firstNum,int secondNum){
        int []nums=new int[2];
        nums[0]=firstNum/secondNum;
        nums[1]=firstNum%secondNum;
        return nums;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNum,secondNum;
        int []nums=new int[2];
        // taking input from the user
        System.out.println("Enter First Number : ");
        firstNum=scanner.nextInt();
        System.out.println("Enter Second Number :");
        secondNum=scanner.nextInt();
        

        // calling the method
        nums= FindRemainderAndQuotient.findRemainderAndQuotient(firstNum, secondNum);
        
        // printing the result
        System.out.println("Quotient is : "+nums[0]);
        System.out.println("Remainder is : "+nums[1]);
            
        scanner.close();
    }
}

