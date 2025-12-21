import java.util.Scanner;

public class FindSmallestAndLargest {
    
    // method for finding the smallest and largest number At first index of array we store largest and at second index we store smallest
    public static int[] findSmallestAndLargest(int firstNum,int secondNum,int thirdNum){
        int []nums=new int[2];
        if (firstNum>=secondNum && firstNum>=thirdNum) {
            nums[0]=firstNum;
            if (secondNum<=thirdNum) {
                nums[1]=secondNum;
            }else{
                nums[1]=thirdNum;
            }
        }else if (secondNum>=firstNum&&secondNum>=thirdNum) {
            nums[0]=secondNum;
            if (firstNum<=thirdNum) {
                nums[1]=firstNum;
            }else{
                nums[1]=thirdNum;
            }
        }else{
            nums[0]=thirdNum;
            if (firstNum<=secondNum) {
                nums[1]=firstNum;
            }else{
                nums[1]=secondNum;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNum,secondNum,thirdNum;
        int []nums=new int[2];
        // taking input from the user
        System.out.println("Enter First Number : ");
        firstNum=scanner.nextInt();
        System.out.println("Enter Second Number :");
        secondNum=scanner.nextInt();
        System.out.println("Enter Third Number : ");
        thirdNum=scanner.nextInt();

        // calling the method
        nums= FindSmallestAndLargest.findSmallestAndLargest(firstNum, secondNum, thirdNum);
        for (int i = 0; i < nums.length; i++) {
            if (i==0) {
                System.out.println("Largest number is : "+nums[i]);
            }else{
                System.out.println("Smallest number is : "+nums[i]);
            }
        }

        scanner.close();
    }
}