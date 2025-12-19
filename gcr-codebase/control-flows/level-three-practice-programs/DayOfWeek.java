import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date: ");
		int d = sc.nextInt();
		
		System.out.println("Enter the month: ");
		int m = sc.nextInt();
		
		System.out.println("Enter the year: ");
		int y = sc.nextInt();
		
		int y0 = y-(14-m)/12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m+12*((14-m)/12)-2;
		int d0 = (d+x+31 * m0/12) % 7;
		
		String day;
		switch(d0)
		{
		case 0:
			day = "Sunday";
		    break;
		case 1:
			day = "Monday";
		    break;
		case 2:
			day = "Tuesday";
		    break;
		case 3:
			day = "Wednesday";
		    break;
		case 4:
			day = "Thursday";
		    break;
		case 5:
			day = "Friday";
		    break;
		case 6:
			day = "Saturday";
		    break;
		default:
			day = "Invalid Input";
		    
		}
		System.out.println("The day of the input date is: " + day);

	}

}
