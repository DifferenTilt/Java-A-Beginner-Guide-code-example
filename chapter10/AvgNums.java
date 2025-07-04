package chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// This program averages a list of numbers entered
// by the user
public class AvgNums {

	public static void main(String[] args) throws IOException {
		// Create a Buffered Reader using System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n;
		double sum = 0.0;
		double avg, t;

		System.out.println("How many numbers will you enter:");
		str = br.readLine();

		// Here we try the conversion of string to integer
		try {
			n = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("Invalid Format");
			n = 0;
		}

		System.out.println("Enter " + n + " values.");
		for (int i = 0; i < n; i++) {
			System.out.println("> ");
			str = br.readLine();

			try {
				t = Double.parseDouble(str);
			} catch (NumberFormatException e) {
				System.out.println("Invalid format");
				// Invalid numbers are simply ignored
				t = 0.0;
			}
			sum += t;
		}
		avg = sum / n;
		System.out.println("Average is " + avg);
	}

}
