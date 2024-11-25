package Hust.soict.dsai.lab01;

import java.util.InputMismatchException;
import java.util.Scanner;
public class DaysInMonth {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input year:");
		int year = 0;
		try {
			year = scanner.nextInt();
		}catch (InputMismatchException ex) {
			System.out.println("Year Format Error");
			System.exit(0);
		}
		if (year < 0) {
			System.out.println("Negative Year");
			System.exit(0);
		}
		String smonth = "";
		String[][] month_input = {{"January", "Jan.", "jan", "1"},
				{"February", "Feb.", "feb", "2"},
				{"March", "Mar.", "mar", "3"},
				{"April", "Apr.", "apr", "4"},
				{"May", "May.", "may", "5"},
				{"June", "jun", "6"},
				{"July", "jul", "7"},
				{"August", "Aug.", "aug", "8"},
				{"September", "Sept.", "sep", "9"},
				{"October", "Oct.", "oct", "10"},
				{"November", "Nov.", "nov", "11"},
				{"December", "Dec.", "dec", "12"}};
		int[][] month_data = {{31,31},{28,29},{31,31},{30,30},{31,31},{30,30},{31,31},{31,31},{30,30},{31,31},{30,30},{31,31}};
		System.out.println("Input month:");
		scanner.nextLine();
		smonth = scanner.nextLine();
		int month;
		boolean found = false;
		for (month = 0; month < 12; month++) {
			for (String i : month_input[month]) {
				if (smonth.equals(i)) {
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}
		if (!found) {
			System.out.println("Month Format Error");
		}
		int nhuan = 0;
		if ((year % 4 == 0 && year % 100!= 0) || (year % 400 == 0)){
			nhuan = 1;
		}
		System.out.println("Number of days is: " + month_data[month][nhuan]);
	}
}
