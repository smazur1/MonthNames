
import java.util.Scanner;

public class MonthNames {

	public static void main(String[] args) {

		int numberOfDays;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter Exact Number of Days in the Month");
		numberOfDays = keyboard.nextInt();

		// This program will print 'May' when you run it.

		String monthNames = "";

		switch (numberOfDays) {
		case 31:
			monthNames = monthNames + "January \t";
			monthNames = monthNames + "March \t";
			monthNames = monthNames + "May \t";
			monthNames = monthNames + "July \t";
			monthNames = monthNames + "August \t";
			monthNames = monthNames + "October \t";
			monthNames = monthNames + "December \t";
			break;
		case 28:
			monthNames = "February";
			break;

		case 29:
			monthNames = "February in a leap year";
			break;
		case 30:
			monthNames = monthNames + "April \t";
			monthNames = monthNames + "June \t";
			monthNames = monthNames + "September \t";
			monthNames = monthNames + "November \t";
			break;

		default:
			monthNames = "Unknown";
			break;
		}
		if (monthNames.equals("Unknown")) {
			System.out.println("No months have exactly " + numberOfDays + " days.");
		} else {

			System.out.println(monthNames);
		}

	}

}
