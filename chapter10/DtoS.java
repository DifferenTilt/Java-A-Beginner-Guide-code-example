package chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// A simple disk-to-screen utility that demonstrates a FileReader.
public class DtoS {

	public static void main(String[] args) {
		String s;
		
		// Create and use a FileReader wrapped in a BufferedReader
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\andrea.brambilla\\eclipse-workspace\\BookExercises\\src\\chapter10\\static\\SECOND.TXT"))) {
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			} 
		} catch (IOException e) {
			System.out.println("I/O Error: " + e);
		}

	}

}
