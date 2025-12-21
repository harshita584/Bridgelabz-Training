import java.util.Scanner;

public class FindRemainderAndQuotientOfChocolat {
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
        System.out.println("Enter the number of Chocolate : ");
        firstNum=scanner.nextInt();
        System.out.println("Enter the number of Student :");
        secondNum=scanner.nextInt();
        

        // calling the method
        nums= FindRemainderAndQuotientOfChocolat.findRemainderAndQuotient(firstNum, secondNum);
        
        // printing the result
        System.out.println("Every Child get "+nums[0]+" Chocolates");
        System.out.println("Remainder is Chocolate is : "+nums[1]);
            
        scanner.close();
    }
}

