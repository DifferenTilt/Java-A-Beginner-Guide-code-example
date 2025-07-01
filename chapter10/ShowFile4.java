package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * This version of ShowFile program use a try-with-resources
 * statement to automatically close a file when it is no longer
 * needed.
 */
public class ShowFile4 {

	public static void main(String[] args) {
		int i;
		
		// First make sure that file name has been specified.
		if (args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}

		// The following code uses a try-with-resources to open a file
		// and then automatically close it when try block is left.
		try (FileInputStream fin = new FileInputStream(args[0])){
			
			do {
				i = fin.read();
				if( i != -1) System.out.print((char) i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}

}
