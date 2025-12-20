import java.util.Scanner;
public class MeanHeight {

	// method to Find the sum of all the elements present in the array
	public static int sumHeights(int heights[])
	{
		int sum_Heights = 0;
		for(int i=0; i<heights.length; i++)
		{
			sum_Heights += heights[i];
		}
		return sum_Heights;
	}
	
	// method to find the mean height of the players on the football team
	public static double meanHeights(int sumOfHeights, int heights[])
	{
		double mean_Heights = sumOfHeights/heights.length;
		return mean_Heights;
	}
	
	// method to find the shortest height of the players on the football team
	public static int shortestHeights(int heights[])
	{
		int shortest=0;
		for(int i=1; i<heights.length; i++)
		{
			if(heights[i]<heights[shortest])
			{
				shortest=i;
			}
		}
		return heights[shortest];
	}
	
	// method to find the tallest height of the players on the football team
	public static int tallestHeights(int heights[])
	{
		int tallest=0;
		for(int i=1; i<heights.length; i++)
		{
			if(heights[i]>heights[tallest])
			{
				tallest=i;
			}
		}
		return heights[tallest];
	}
	
	
	public static void main(String[] args) {
		// Defining the array
		int heights[] = new int[11];
		
		// Taking input of the heights of all players
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<heights.length; i++)
		{
			System.out.println("Enter the height of player " + (i+1) + " (in cm) : ");
			int height = sc.nextInt();
			if(height<150 || height>250)
			{
				System.out.println("Invalid Input.");
				i--;
				continue;
			}
			heights[i] = height;
		}
		// Invoking the method
		int sumOfHeights = sumHeights(heights);
		double meanOfHeights = meanHeights(sumOfHeights,heights);
		int shortestOfHeights = shortestHeights(heights);
		int tallestOfHeights = tallestHeights(heights);
		
		
		// Printing the output
		System.out.println();
		System.out.println("The sum of heights of all players is : " + sumOfHeights);
		System.out.println("The mean of heights of all players is : " + meanOfHeights);
		System.out.println("The shortest height from all players is : " + shortestOfHeights);
		System.out.println("The tallest height from all players is : " + tallestOfHeights);
	}

}
