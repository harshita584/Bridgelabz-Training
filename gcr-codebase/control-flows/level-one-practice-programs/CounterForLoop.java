// Rewrite program 8 to do the countdown using the for-loop


import java.util.Scanner;
public class CounterForLoop{
    public static void main(String args[]){
        int counter;
        
        //Taking the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the counter : ");
        counter = sc.nextInt();
        System.out.println();

        for(int i=counter; i>=1; i--)
        {
        System.out.println(i);
        }

        System.out.println("Launched Successfully..!");

        
   }
}
