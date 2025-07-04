package chapter10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

// A simple key-to-disk utility that demonstrates a FileWriter.
public class KtoD {

	public static void main(String[] args) {
		String str;
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		
		System.out.println("Enter text ('stop' to quit).");
		
		// Here FileWriter will be automatically closed at the end.
		try (FileWriter fw = new FileWriter("C:\\Users\\andrea.brambilla\\eclipse-workspace\\BookExercises\\src\\chapter10\\static\\test1.txt")) {
			do {
				System.out.println(": ");
				str = br.readLine();
				
				if (str.compareTo("stop") == 0) {
					break;
				}
				str = str + "\r\n"; // add new line
				fw.write(str);
			} while (str.compareTo("stop") != 0);
		} catch (IOException e) {
			System.out.println("I/O Exception. " + e);
		}

	}

}
