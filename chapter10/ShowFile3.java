package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Display a text file.
 * 
 * another version of ShowFile
 * For example, to see a file called TEST.TXT,
 * use the following command line.
 * 
 * java ShowFile TEST.TXT
 */
public class ShowFile3 {

	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		
		// First make sure that a file has been specified.
		if (args.length != 1) {
			System.out.println("Usage: ShowFile File");
			return;
		}
		
		try {
			// open the file
			fin = new FileInputStream(args[0]);
		
			// read bytes until EOF is encountered
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
				System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("An I/O exception has occurred.");
		} 
		// close file in all cases.
		finally {
			// Close the file on the way out of the try-catch block
			try {
				if (fin != null) fin.close();
			} catch (IOException e) {
				System.out.println("Error closing file.");
			}
		}
		
	}

}
