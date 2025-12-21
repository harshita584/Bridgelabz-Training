import java.util.Scanner;

public class MaximumHandshake {
    
    //method for finding the maximum possible handshakes
    public static void maximumHandshakes(int students){
         int totalNumberOfHandshakes= (students * (students - 1)) / 2;
         System.out.println("Number of possible handshakes is :"+totalNumberOfHandshakes);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int students;

        //taking inputs from the user
        System.out.println("Enter the Number of Students :");
        students=scanner.nextInt();

        //calling the method for calculating possible number of handshakes
        MaximumHandshake.maximumHandshakes(students);

        scanner.close();

    }
}