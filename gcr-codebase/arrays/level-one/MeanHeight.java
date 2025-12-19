import java.util.Scanner;
public class MeanHeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

                // Defining the array to store the heights
		double heights[] = new double[11];
		for(int i=0; i<heights.length; i++)
		{
                        System.out.println("Enter the height of the player: ");
			heights[i] = sc.nextDouble();
		}
		
                // Adding the height to sum variable
		double sum=0.0;
		for(int i=0; i<heights.length; i++)
		{
			sum += heights[i];
		}
		
                // calculating the mean height and printing it
		double meanHeight = sum/heights.length;
		System.out.println("The mean height of the football team is: "+ meanHeight);
	}

}