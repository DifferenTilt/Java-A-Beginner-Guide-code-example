package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Display a text file.
 * 
 * optimized version of ShowFile
 * For example, to see a file called TEST.TXT,
 * use the following command line.
 * 
 * java ShowFile TEST.TXT
 */
public class ShowFile2 {

	public static void main(String[] args) {
		int i;
		FileInputStream fin;
		
		// First make sure that a file has been specified.
		if (args.length != 1) {
			System.out.println("Usage: ShowFile File");
			return;
		}
		
		try {
			// open the file
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e);
			return;
		}
		
		try {
			// read bytes until EOF is encountered
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("Error reading file.");
		} 
		//	One advantage to this approach in general is that if the code that accesses a file terminates 
		//	because of some non-I/O-related exception, the file is still closed by the finally block. 
		finally {
			// Close the file on the way out of the try-catch block
			try {
				fin.close();
			} catch (IOException e) {
				System.out.println("Error closing file.");
			}
		}
		
	}

}
